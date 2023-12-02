package Helloworld;
import java.util.Random;
public class EvenOddThread {
	public static void main(String[]args) {
		NumberManager numbermanager=new NumberManager();
		NumberGenerator numbergenerator=new NumberGenerator(numbermanager);
		EvenPrinterThread evenprinterthread= new EvenPrinterThread(numbermanager);
		OddPrinterThread oddprinterthread= new OddPrinterThread(numbermanager);
		numbergenerator.start();
		evenprinterthread.start();
		oddprinterthread.start();
	}

}
class NumberManager{
	private int genNum;
	private boolean numGen=false;
	public synchronized void genNum() {
		genNum= new Random().nextInt(99)+2;
		System.out.println("Generated Random Number="+genNum);
		numGen=true;
		notifyAll();
	}
	public synchronized void printEvenNumbers() throws InterruptedException{
		while(!numGen||genNum%2!=0) {
			wait();
		}
		System.out.println("Square of the Number is "+genNum*genNum);
		numGen=false;
		
	}
	public synchronized void printOddNumbers() throws InterruptedException{
		while(!numGen||genNum%2==0) {
			wait();
		}
		System.out.println("Cube of the Number is "+genNum*genNum*genNum);
		numGen=false;
		
	}
}
class NumberGenerator extends Thread{
	NumberManager numbermanager;
	public  NumberGenerator(NumberManager numbermanager) {
		this.numbermanager=numbermanager;
	}
	public void run() {
		while(true) {
		numbermanager.genNum();
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	
}
}
class EvenPrinterThread  extends Thread{
	NumberManager numbermanager;
	public EvenPrinterThread(NumberManager numbermanager) {
		this.numbermanager=numbermanager;
	}
	public void run(){
		while(true) {
		try {
			numbermanager.printEvenNumbers();
		}
		catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}
class OddPrinterThread extends Thread{
	NumberManager numbermanager;
	public OddPrinterThread(NumberManager numbermanager) {
		this.numbermanager=numbermanager;
	}
	public void run(){
		while(true) {
		try {
			numbermanager.printOddNumbers();
		}
		catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}

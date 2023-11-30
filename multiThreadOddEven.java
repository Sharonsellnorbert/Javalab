package javalab;
import java.util.Random;
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
		for(int i=2;i<genNum;i+=2) {
			System.out.println(i+"");
		}
		numGen=false;
		
	}
	public synchronized void printOddNumbers() throws InterruptedException{
		while(!numGen||genNum%2==0) {
			wait();
		}
		for(int i=1;i<genNum;i+=2) {
			System.out.println(i+"");
		}
		numGen=false;
		
	}
}
class NumberGenerator extends Thread{
	NumberManager numbermanager;
	public  NumberGenerator(NumberManager numbermanager) {
		this.numbermanager=numbermanager;
	}
	public void run() {
		numbermanager.genNum();
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
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
public class multiThreadOddEven {
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


/*
 * File			:FileException.java
 * Description	:To copy details for one file to another
 * Author		:Sharon Sell Norbert
 * Version 		:1.0
 * Date			:24-11-2023
 */
package Helloworld;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileException {
public static void main(String[]args) throws FileNotFoundException,IOException {
    FileReader Fr=null;
    FileWriter Fw=null;
	String Data="Hello";
    char array[]=new char[50];
	try{
		Fw=new FileWriter("input.txt");
    	Fw.write(Data);
    	Fw.flush();
    	Fw.close();
    	Fr=new FileReader("inpu.txt");
    	int bytes=Fr.read(array);
   
    	
    	Fw=new FileWriter("output.txt");
    	Fw.write(array,0,bytes);
		Fw.flush();
		Fw.close();
		Fr.close();
    }
    catch(IOException e) {
    	System.out.println("An Error has occured");
    	e.printStackTrace();
    }
    
}
}

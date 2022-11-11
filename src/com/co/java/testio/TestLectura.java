package com.co.java.testio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestLectura {
 
	public static void main(String[] args) throws IOException {
		//class FileInputStream is a class that capture fields read the file
		FileInputStream fileinputstream = new FileInputStream("java.text");
		
		
		/**this two class extends of the same class reader so for herency we can use both in the differents class*/
		
		//the InputStreamReades procces the field should pass for parameter the fileinputstream
		InputStreamReader inputStreamReader = new InputStreamReader(fileinputstream);
		//bufferedReader read the field the Inputstreamreader not is a type of class for read because your method read return to bytes
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String linea; //read each line of my text and return a String.
		 //only read the first line of my text
		
		while((linea = bufferedReader.readLine()) != null) { //print each line of my text because evaluate while nothing line is null print the line 
			System.out.println(linea);
		}
	}
}
package com.co.java.testio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestWriter {

	public static void main(String[] args) throws IOException {
				
		FileOutputStream myFileOutputStream = new FileOutputStream("myfieldgenerate.text");
		Writer myOutputStreamWrite = new OutputStreamWriter(myFileOutputStream);
		BufferedWriter myWrite = new BufferedWriter(myOutputStreamWrite);
		
		//read the file and create a new line 
		myWrite.write("Hola que mas");
		myWrite.newLine();
		myWrite.write("como amaneciste?");
		/**
		 * NOTE = Is Necessary make a refresh of the eclipse for see the creation of the field
		 */
		myWrite.close(); //close the file for generate the same;
		
		
		
	}
	
	
}

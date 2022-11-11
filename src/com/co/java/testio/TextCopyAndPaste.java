package com.co.java.testio;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TextCopyAndPaste {
	
	/**
	 * only we'll take the field mother.text and copy his content for generate other field with the same text "copy and paste"
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		
		//FileInputStream fileinputstream = new FileInputStream("mother.text");
		InputStream fileinputstream = System.in; //Here the InputStream take any value (String,bytes,int,ETC) in this case is for my system
		InputStreamReader inputStreamReader = new InputStreamReader(fileinputstream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		/*
		 * Create a new file, process and write
		 */
		//OutputStream myFileOutputStream = new FileOutputStream("myothergenerate.text");
		OutputStream myFileOutputStream = new FileOutputStream("myothergenerate.text");
		Writer myOutputStreamWrite = new OutputStreamWriter(myFileOutputStream);
		BufferedWriter myWrite = new BufferedWriter(myOutputStreamWrite);
		
		
		String linea; 
		
		//this while have the logic here the bufferedReader read depending of the field that have BufferedWriter
		while((linea = bufferedReader.readLine()) != null) {
			myWrite.write(linea);
			myWrite.newLine();
		}
		
		myWrite.close();
	
	}
}

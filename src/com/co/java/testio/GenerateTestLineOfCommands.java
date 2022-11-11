package com.co.java.testio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class GenerateTestLineOfCommands {
		/**
		 * only we'll take the field mother.text and copy his content for generate other field with the same text "copy and paste"
		 * @param args
		 * @throws IOException
		 */

		public static void main(String[] args) throws IOException {
			
			//Here the InputStream take any value (String,bytes,int,ETC) in this case is for my system
			InputStream fileinputstream = System.in; 
			InputStreamReader inputStreamReader = new InputStreamReader(fileinputstream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			
			OutputStream myFileOutputStream = new FileOutputStream("TestGenerateForSystem.text");
			Writer myOutputStreamWrite = new OutputStreamWriter(myFileOutputStream);
			BufferedWriter myWrite = new BufferedWriter(myOutputStreamWrite);
			
			
			String linea; 
			
			//this while have the logic here the bufferedReader read depending of the field that have BufferedWriter
			while((linea = bufferedReader.readLine()) != null) {
				myWrite.write(linea);
				myWrite.newLine();
				}
		}
}



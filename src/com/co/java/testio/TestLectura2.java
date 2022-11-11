package com.co.java.testio;

import java.io.FileWriter;
import java.io.IOException;


public class TestLectura2 {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter FL = new FileWriter("TextWithFileWrite");
		FL.write("Hola que mas");
		/*File separataror is similiar to a method newline of BufferedWriter bu in this case, 
		depends of our system operative in case of windows is "\r\n" in case of unix is "\n"*/
		
		FL.write((System.lineSeparator())); 
		FL.write("Como estas");
		FL.close();
}
}

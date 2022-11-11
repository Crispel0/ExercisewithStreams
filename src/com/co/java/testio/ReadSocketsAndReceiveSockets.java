package com.co.java.testio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;


public class ReadSocketsAndReceiveSockets {

	public static void main(String[] args) throws IOException {
		//I can't show for console because is a socket so I need make configurations for this//
		
		/**
		 * Basically this class is for show that not is necessary create a InputStream for read fields 
		 * in this case the socket have for read and the InputStream process the socket
		 */
		Socket mySocket1 = new Socket();
		Reader myOS = new InputStreamReader(mySocket1.getInputStream());
		BufferedReader myBR = new BufferedReader(myOS);
		
		/**
		 * here create other socket for receive the first socket "the sockets always need communicate between two"
		 * and the final step make write the socket
		 */
		Socket mySocket2 = new Socket();
		Writer myOSR = new OutputStreamWriter(mySocket2.getOutputStream());
		BufferedWriter myBFR = new BufferedWriter(myOSR);
		
		String linea;
		/**
		 * here is the logic if BufferedWriter not is null automacally entry in the while and write about the socket
		 * and store this in the variable type String call linea
		 */
		while((linea = myBR.readLine()) != null) {
			myBFR.write(linea);
			myBFR.newLine();
			}
}
}

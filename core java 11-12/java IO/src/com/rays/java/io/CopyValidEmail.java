package com.rays.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyValidEmail {
public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new FileReader("C:\\IO\\mail.txt"));
	BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\IO\\newmail.txt"));
	
	String mail = br.readLine();
	while(mail != null) {
		if (mail.endsWith("@gmail.com")) {
			System.out.println("email:" + mail);
			bw.write(mail);
			bw.newLine();
		}
	  mail = br.readLine();
		
	}
	System.out.println("Valid email copy successfuly");
	br.close();
	bw.close();
}
}

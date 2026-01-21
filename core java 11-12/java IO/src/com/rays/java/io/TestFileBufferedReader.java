package com.rays.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileBufferedReader {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader (new FileReader("C:\\IO\\Abhi.txt"));
		String line = br.readLine();
		
		

	while (line !=null) {
		System.out.println(line);
		line = br.readLine();
	}
	br.close();
	}
}

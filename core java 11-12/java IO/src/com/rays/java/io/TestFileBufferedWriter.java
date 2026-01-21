package com.rays.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileBufferedWriter {
public static void main(String[] args) throws IOException {

	BufferedWriter bw = new  BufferedWriter(new FileWriter("C://IO//newAbhi.txt"));
	bw.newLine();
	bw.write("java is programing language");
	bw.newLine();
	bw.write("Follow oop metholgy");
	bw.newLine();
	bw.write("think only objecty");
	
	System.out.println("text file write successfully");
	
	
	bw.close();
	
}
}

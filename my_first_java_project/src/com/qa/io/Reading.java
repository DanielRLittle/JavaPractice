package com.qa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reading {
	public static void main(String[] args) throws IOException {
		BufferedReader bfdRead = new BufferedReader(new FileReader("C:/Users/Admin/Desktop/inText.txt"));
		String line = bfdRead.readLine();
		while(line != null) {
			System.out.println(line);
			line = bfdRead.readLine();
		}
		
		BufferedWriter bfdWrite = new BufferedWriter(new FileWriter("C:/Users/Admin/Desktop/outText.txt"));
		bfdWrite.write("new line" + "\r\n");
		bfdWrite.write("yay!" + "\r\n");
		bfdWrite.close();
	}
	
}

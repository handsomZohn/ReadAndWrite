package com.io;

import java.io.File;
import java.io.FileInputStream;



public class ForFile {

	public static void main(String[] args) throws Exception {
		File file = new File("e:/�˻���PWD.txt");
		FileInputStream fileInputStream = new FileInputStream("e:/�˻���PWD.txt");
		int i = fileInputStream.read();
		while (i != -1) {
			System.out.println(i);
		}
		fileInputStream.close();
	}

}

package com.io;

import java.io.File;
import java.io.FileInputStream;



public class ForFile {

	public static void main(String[] args) throws Exception {
		File file = new File("e:/账户与PWD.txt");
		FileInputStream fileInputStream = new FileInputStream("e:/账户与PWD.txt");
		int i = fileInputStream.read();
		while (i != -1) {
			System.out.println(i);
		}
		fileInputStream.close();
	}

}

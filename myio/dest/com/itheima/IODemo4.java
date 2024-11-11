package com.itheima;

import java.io.FileReader;
import java.io.IOException;

public class IODemo4 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("myio/b.txt");
		char[] c = new char[1024];
		int len;
		while ((len = fr.read(c)) != -1) {
		}
		System.out.println(new String(c));
		fr.close();
	}
}

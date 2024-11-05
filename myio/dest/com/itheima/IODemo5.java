package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo5 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("myio/c.txt");
		fw.write("我草nm");

		fw.close();
	}
}

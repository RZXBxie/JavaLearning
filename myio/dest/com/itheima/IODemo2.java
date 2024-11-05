package com.itheima;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("myio/a.txt", true);
		String s = "wohaoshuai\r\n666";
		fos.write(s.getBytes());
		fos.write(s.getBytes());

		fos.close();

	}

}

package com.itheima;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class IOTest2 {
	public static void main(String[] args) throws IOException {
		/*
		将文件中的数据排序后重写写回文件当中
		如：2-1-7-4-9-8
		 */
		// 1.读取数据
		FileReader fr = new FileReader("myio/a.txt");
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = fr.read()) != -1) {
			sb.append((char) ch);
		}
		fr.close();

		// 2.排序
		Integer[] arr = Arrays.stream(sb.toString()
				.split("-"))
				.map(Integer::parseInt)
				.sorted()
				.toArray(Integer[]::new);

		// 3.写回
		FileWriter fw = new FileWriter("myio/a.txt");
		String s = Arrays.toString(arr).replace(", ", "-");
		String substring = s.substring(1, s.length() - 1);
		fw.write(substring);
		fw.close();
	}
}

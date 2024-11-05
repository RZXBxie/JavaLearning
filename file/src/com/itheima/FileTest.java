package com.itheima;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		/*
		1. 在当前模块下的aaa文件夹中创建a.txt文件
		 */
		File f1 = new File("file\\aaa");
		f1.mkdirs();
		File src = new File(f1, "a.txt");
		src.createNewFile();

		/*
		2. 定义一个方法，找到电脑中否存在以.txt结尾的文件（包括子文件夹）
		 */
		havaTXT();

		

	}

	public static void havaTXT() {
		File[] roots = File.listRoots();
		boolean flag = false;
		for (File root : roots) {
			flag = havaTXT(root);
			if (flag) break;
		}
		System.out.println(flag);
	}

	public static boolean havaTXT(File file) {
		if (file.isFile()) {
			String name = file.getName();
			if (name.endsWith(".txt")) {
				System.out.println(name);
				return true;
			}
		}
		File[] files = file.listFiles();
		boolean flag = false;
		if (files != null) {
			for (File f : files) {
				if (f.isDirectory()) flag = havaTXT(f);
				else {
					if (f.getName().endsWith(".txt")) {
						System.out.println(f.getName());
						flag = true;
					}
				}
				if (flag) break;
			}
		}

		return flag;
	}
}

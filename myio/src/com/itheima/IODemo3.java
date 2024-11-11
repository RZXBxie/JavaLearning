package com.itheima;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo3 {
	public static void main(String[] args) throws IOException {
		/*
		文件拷贝
		将D盘下的mdbx.dat文件拷贝到当前模块下
		自动是释放资源
		 */
		FileInputStream fis = new FileInputStream("D:\\mdbx.dat");
		FileOutputStream fos = new FileOutputStream("myio\\copy.dat");
		try (fis; fos) {
			byte[] buf = new byte[1024];
			int len;
			while ((len = fis.read(buf)) > 0) {
				fos.write(buf, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

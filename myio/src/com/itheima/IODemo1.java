package com.itheima;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo1 {
	public static void main(String[] args) throws IOException {
		/*
		字节输出流细节：
			1、创建字节输出流对象
				细节1：参数可以传递字符串表示的路径或者File对象
				细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
				细节3：如果文件已经存在，会清空文件
			2、写数据
				细节：write方法的参数是整数，但写到文件中的是整数在ASCII码中对应的字符
			3、释放资源
				每次使用完流后都要释放
		 */


		FileOutputStream fos = new FileOutputStream("myio\\a.txt");
		fos.write(97);
		fos.close();
	}
}

package com.itheima;

import java.io.*;

public class ObjectStreamDemo1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 利用序列化流/对象操作输出流，将一个对象保存到本地文件中

		// 1.创建对象
		Student s = new Student(1, "xiefeng");

		// 2.创建序列化流的对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio/d.txt"));

		// 3.写出数据
		oos.writeObject(s);

		// 4.释放资源
		oos.close();

		// 利用反序列化流从文件中读取数据
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio/d.txt"));
		Student o = (Student) ois.readObject();
		System.out.println(o);
		ois.close();
	}
}

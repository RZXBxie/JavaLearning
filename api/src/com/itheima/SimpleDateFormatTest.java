package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
		Date d = new Date(0L);
		System.out.println(sd.format(d));

		System.out.println("==============分割线==============");
		String str = "2000-11-11";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(str);
		sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf.format(d1));

	}
}

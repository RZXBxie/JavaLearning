package com.itheima;

public class RegularExpressionTest {
	public static void main(String[] args) {
		/* 假如现在要校验一个qq号是否正确。
		规则：6位-20位之间，0不能在开头，必须全部是数字
		 */
		String qq = "2545147971";
		System.out.println(qq.matches("^[1-9][0-9]{5,19}$"));

		/*
		请编写正则表达式判断用户输入的手机号是否正确
		手机号码：  13112345678 13712345667 13945679027 139456790271
		规则：
			1、只能以1开头
			2、第二位只能是3-9之间的数字
			3、长度只能是11位
		 */
		System.out.println("============phone number============");
		String[] phoneNumber = {"03112345678", "12712345667", "1945679027", "13945679027"};
		String regex1 = "1[3-9]\\d{9}";
		for (String number : phoneNumber) {
			System.out.println(number.matches(regex1));
		}

		/*
		请编写正则表达式判断用户输入的座机号是否正确
		座机号码：  020-2324242 02122442 027-42424 0712-3242434
		规则：
			1、区号以0开头
			2、区号长度3-4位
			3、-可以出现也可以不出现
			4、号码第一位不能以0开头，号码总长度为5-10位
		 */
		System.out.println("============tel number============");
		String[] telNumber = {"020-2324242", "021-2442", "027-42424", "0712-3242434"};
		String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
		for (String number : telNumber) {
			System.out.println(number.matches(regex2));
		}

		/*
		请编写正则表达式判断用户输入的邮箱是否正确
		规则：
			1、@的左边可以是数字、字母、下划线，至少出现一次
			2、@必须出现且只能出现一次
			3、
		 */
		System.out.println("============email============");
		String[] emails = {"", "021-2442", "027-42424", "0712-3242434"};
		String regex3 = "0\\d{2,3}-?[1-9]\\d{4,9}";
		for (String email : emails) {
			System.out.println(email.matches(regex3));
		}

		System.out.println("============捕获分组============");
		// 捕获分组，正则内部使用
		/*
		请编写正则表达式，判断一个字符串的开始部分和结束部分是否一致
		 */
		String str1 = "aaa23920382093aaa";
		String regex = "((.)\\1*).+\\2";
		System.out.println(str1.matches(regex));
		// 捕获分组，正则外部使用
		/*
		请编写正则表达式，将 我要学学编编编编程程程程程程程程程程程程程程程程 替换为 我要学编程
		 */
		String str2 = "我要学学编编编编程程程程程程程程程程程程程程程程";
		// $1表示将第一组的内容再用一次，但是是用在正在外部
		System.out.println(str2.replaceAll("(.)\\1+", "$1"));

	}
}

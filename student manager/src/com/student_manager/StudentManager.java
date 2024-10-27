package com.student_manager;

import java.util.*;

public class StudentManager {
	private static final String ADD_STUDENT = "1";
	private static final String DELETE_STUDENT = "2";
	private static final String MODIFY_STUDENT = "3";
	private static final String PRINT_STUDENT = "4";
	private static final String EXIT = "5";
	static final HashSet<String> STUDENT_ID_SET = new HashSet<>();         // 存储了学生id的集合，用于快速判断某个id是否存在
	static final HashMap<String, Student> STUDENT_MAP = new HashMap<>();   //学生id -> 学生信息的映射

	public static void main(String[] args) {
		StudentManagerHomePage.homePage();
	}

	static void manageStudents() {
		while (true) {
			System.out.println("-------------------欢迎来到黑马学生管理系统------------------");
			System.out.println("1：添加学生");
			System.out.println("2：删除学生");
			System.out.println("3：修改学生");
			System.out.println("4：查询学生");
			System.out.println("5：退出");
			System.out.println("请输入您的选择：");
			Scanner sc = new Scanner(System.in);
			String choice = sc.next();
			switch (choice) {
				case ADD_STUDENT:
					insertStudent();
					break;
				case DELETE_STUDENT:
					deleteStudent();
					break;
				case MODIFY_STUDENT:
					modifyStudent();
					break;
				case PRINT_STUDENT:
					printStudent();
					break;
				case EXIT:
					System.exit(0);
					break;
				default:
					System.out.println("输入字符非法，请重新输入！");
					break;
			}
		}
	}

	/**
	 * 添加：在控制台输入学生信息，如果id不存在则添加到学生列表中
	 */
	public static void insertStudent() {
		System.out.println("请输入学生id：");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		if (STUDENT_ID_SET.contains(id)) {
			System.out.printf("id为%s的学生已经存在，请修改id后重试\n", id);
			return;
		}
		STUDENT_ID_SET.add(id);
		System.out.println("请输入学生姓名：");
		String name = sc.next();
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		System.out.println("请输入地址：");
		String location = sc.next();
		Student student = new Student(id, name, age, location);
		STUDENT_MAP.put(id, student);
		System.out.println("学生添加成功！");
	}

	/**
	 * 删除：在控制台输入学生id，如果id存在则从学生列表中删除
	 */
	public static void deleteStudent() {
		System.out.println("请输入要删除的学生id：");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		if (STUDENT_ID_SET.contains(id)) {
			STUDENT_MAP.remove(id);
		} else {
			System.out.printf("id为%s的学生不存在，请核对后重试\n", id);
		}
	}

	/**
	 * 更新：在控制台输入学生id，如果id存在则输入其他信息，然后更新学生
	 */
	public static void modifyStudent() {
		System.out.println("请输入要修改的学生id：");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		if (STUDENT_ID_SET.contains(id)) {
			System.out.println("请输入修改后的姓名：");
			String name = sc.next();
			System.out.println("请输入修改后的年龄：");
			int age = sc.nextInt();
			System.out.println("请输入修改后的地址：");
			String location = sc.next();
			modify(id, name, age, location);
		} else {
			System.out.printf("id为%s的学生信息不存在，请重新输入\n", id);
		}
		System.out.println("删除成功！");
	}

	/**
	 * 查询：输出所有学生的信息
	 */
	public static void printStudent() {
		if (STUDENT_MAP.isEmpty()) {
			System.out.println("当前没有用学生信息，添加后再试！");
			return;
		}
		System.out.println("id\t\tname\t\tage\t\tlocation");
		for (Map.Entry<String, Student> entry : STUDENT_MAP.entrySet()) {
			Student student = entry.getValue();
			System.out.println(student);
		}
	}

	private static void modify(String id, String name, int age, String location) {
		for (Map.Entry<String, Student> entry : STUDENT_MAP.entrySet()) {
			String existId = entry.getKey();
			Student student = entry.getValue();
			if (student.getId().equals(id)) {
				student.setName(name);
				student.setAge(age);
				student.setLocation(location);
			}
		}
	}
}

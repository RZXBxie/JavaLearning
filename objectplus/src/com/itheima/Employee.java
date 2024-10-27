package com.itheima;

public class Employee {
	private String id;
	private String name;
	private String responsibility;

	public Employee() {
	}

	public Employee(String id, String name, String responsibility) {
		this.id = id;
		this.name = name;
		this.responsibility = responsibility;
	}

	public void work(){
		System.out.println("员工在工作");
	}
}

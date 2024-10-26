package com.objectplus;

public class Employee {
	private String employeeNo;
	private String name;
	private int salary;

	public Employee() {
	}

	public Employee(String employeeNo, String name, int salary) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.salary = salary;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void work() {
		System.out.println("工作");
	}

	public void eat() {
		System.out.println("吃米饭");
	}
}
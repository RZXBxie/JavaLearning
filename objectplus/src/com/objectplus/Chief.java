package com.objectplus;

public class Chief extends Employee {
	public Chief() {

	}

	public Chief(String employeeNo, String name, int salary) {
		super(employeeNo, name, salary);
	}

	@Override
	public void work() {
		System.out.println("炒菜");
	}
}

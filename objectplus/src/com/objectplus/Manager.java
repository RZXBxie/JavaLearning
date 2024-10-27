package com.objectplus;

public class Manager extends Employee {
	private int bonus;

	public Manager() {
	}

	public Manager(String employeeNo, String name, int salary, int bonus) {
		super(employeeNo, name, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("管理其他人");
	}
}

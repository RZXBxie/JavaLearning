package com.itheima;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {

	@Serial
	private static final long serialVersionUID = -6245367941737875197L;
	private int id;
	private String name;
	private String address;

	public Student() {
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * 获取
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 设置
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 获取
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}

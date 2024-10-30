package com.itheima;

import java.util.StringJoiner;

public class User implements Cloneable {
	int id;
	String name;
	String password;
	String path;
	int[] data;

	public User() {
	}

	public User(int id, String name, String password, String path, int[] data) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.path = path;
		this.data = data;
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

	/**
	 * 获取
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取
	 * @return path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * 设置
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 获取
	 * @return data
	 */
	public int[] getData() {
		return data;
	}

	/**
	 * 设置
	 * @param data
	 */
	public void setData(int[] data) {
		this.data = data;
	}

	public String toString() {
		return "User{id = " + id + ", name = " + name + ", password = " + password + ", path = " + path + ", data = " + arrToString() + "}";
	}

	public String arrToString() {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for (int datum : data) {
			sj.add(datum + "");
		}
		return sj.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

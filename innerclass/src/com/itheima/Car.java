package com.itheima;

public class Car {
	private String carName;
	private int carAge;
	private String carColor;

	private class Engine{
		private String engineBrand;
		private String engineAge;
	}
	private Engine engine;

	public void show() {
		System.out.println(engine.engineBrand + " " + engine.engineAge);
	}


}

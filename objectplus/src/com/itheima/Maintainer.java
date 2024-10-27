package com.itheima;

public class Maintainer extends AdminStaff{
	public Maintainer() {
	}

	@Override
	public void work() {
		System.out.println("维护人员在检修物品");
	}
}

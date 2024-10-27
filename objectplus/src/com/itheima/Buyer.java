package com.itheima;

public class Buyer extends AdminStaff{
	public Buyer() {
	}

	@Override
	public void work() {
		System.out.println("采购专员在采购物品");
	}
}

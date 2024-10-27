package com.itheima.object;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];
        Goods g1 = new Goods(1, "华为p40", 5999.0, 100);
        Goods g2 = new Goods(2, "保温杯", 227.0, 60);
        Goods g3 = new Goods(3, "枸杞", 59.2, 40);
        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getId() + ", " + goods[i].getName() + ", " + goods[i].getPrice() + ", " + goods[i].getCount());
        }

    }
}

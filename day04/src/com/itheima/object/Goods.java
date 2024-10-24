package com.itheima.object;

public class Goods {
    private int id;
    private String name;
    private double price;
    private int count;


    public Goods() {
    }

    public Goods(int id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    /**
     * 获取商品id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置商品id
     * @param id 商品id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取商品名
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名
     * @param name 商品名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品价格
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     * @param price 商品价格
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取库存
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置库存
     * @param count 库存
     */
    public void setCount(int count) {
        this.count = count;
    }

}

package com.itheima.object;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {

    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.name + "打了" + role.getName() + "一拳, 造成了" + hurt + "点伤害.\n"
        + role.getName() + "剩余血量：" + role.getBlood());

    }
}

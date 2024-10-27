package objectOriented;

import java.util.Date;

/**
 * 父类的this关键字可以调用其他构造方法
 */

public class Father {
    private String name;
    private int age;
    private Date birthDate;

    public Father(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.birthDate = date;
    }

    public Father(String name, int age) {
        this(name, age, new Date());
    }
}

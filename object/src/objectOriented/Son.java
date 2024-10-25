package objectOriented;

import java.util.Date;

/**
 * 1. 子类继承自父类，调用父类构造方法时必须用super关键字
 * 2. super必须位于子类构造方法的第一个位置
 * 3. 如果子类拥有和父类一样的成员变量，则父类成员变量和方法会被隐藏
 */

public class Son extends Father {
    private String school;
    public Son(String name, int age, Date date, String school) {
        super(name, age, date);
        this.school = school;
    }

    public Son(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public Son(String name, String school) {
        this(name, 0, school);
    }
}

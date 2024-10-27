package objectOriented;

/**
 * 静态成员变量和静态成员方法实践
 * 1. 静态成员方法只能访问静态成员变量和其他静态成员方法
 * 2. 静态变量可以在声明的同时初始化，如果不想初始化，可以使用静态代码块
 * 3. 静态代码块在类第一次加载时被执行，并执行一次
 */

public class StaticVariableAndMethod {
    double amount = 0.0;
    String owner;

    // static variable
    static double interestRate;

    public static double interestBy(double amount) {
        return interestRate * amount;
    }

    static {
        System.out.println("静态代码块被调用");
        interestRate = 0.0668;
    }
}

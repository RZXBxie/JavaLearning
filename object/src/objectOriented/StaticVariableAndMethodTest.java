package objectOriented;

public class StaticVariableAndMethodTest {
    public static void main(String[] args) {
        StaticVariableAndMethod account = new StaticVariableAndMethod();
        System.out.println(StaticVariableAndMethod.interestRate);
        System.out.println(StaticVariableAndMethod.interestBy(1000.0));
    }
}

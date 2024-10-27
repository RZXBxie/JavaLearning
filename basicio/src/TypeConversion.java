public class TypeConversion {
    public static void main(String[] args) {
        // Test1: byte plus byte
        byte a = 127;
        byte b = 1;
        System.out.println(a + b);
        // Test2: short plus short
        short c = 32767;
        short d = 1;
        System.out.println(c + d);
        // 结论：short、byte和char会先隐式转为int，然后再运算

        // Test3: int plus double
        int e = 10;
        double f = 22.2;
        System.out.println(e + f);
        // 结论：不同类型的变量运算时，会将取值范围小的隐式转为取值范围大的
    }
}

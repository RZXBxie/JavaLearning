import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        /* input
        1. import java.util.Scanner;
        2. Scanner sc = new Scanner(System.in);
        3. int i = sc.nextInt();
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println(number);

        /* format output
        1. String format = String.format();
        2. System.out.println(format);
         */
        String name = "xiefeng";
        int age = 22;
        String format = String.format("name: %s, age: %d", name, age);
        System.out.println(format);
    }
}

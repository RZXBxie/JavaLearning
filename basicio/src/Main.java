import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 键盘录入一个三位数，将其拆分为个位、十位和百位，并打印在控制台
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        while (number != 0) {
            System.out.println(number % 10);
            number /= 10;
        }

        System.out.println("the end");

    }
}
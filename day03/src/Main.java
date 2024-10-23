import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("数组练习");
        arrayTest();
    }

    public static void arrayTest() {
        int[] nums = new int[10];
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100) + 1;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int avg = sum / 10;
        int count = 0;
        for (int num : nums) {
            if (num < avg) {
                count++;
            }
        }
        String format = String.format("sum: %d, avg: %d, count: %d", sum, avg, count);
        System.out.println(format);
    }
}
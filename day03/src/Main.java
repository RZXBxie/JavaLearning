import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("数组练习");
        arrayTest();
        System.out.println(getSum(1, 2));
        System.out.println(getSum(1, 3, 4));

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] ans = copyOfRange(nums, 0, 3);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] copyOfRange(int[] nums, int start, int end) {
        int[] ans = new int[end - start];
        for (int i = start; i < end; i++) {
            ans[i] = nums[i];
        }
        return ans;
    }

    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
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
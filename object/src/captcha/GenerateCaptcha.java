package captcha;

import java.util.Random;

/**
 * 验证码生成类
 * 随机生成五位验证码，其中前四位是大小写字母的组合，最后一位是随机的数字
 */

public class GenerateCaptcha {
    public static void main(String[] args) {
        String verifyCode = generateCaptcha();
        System.out.println(verifyCode);
    }

    /**
     * 随机生成五位数的验证码
     * @return 五位的验证码字符串
     */
    public static String generateCaptcha() {
        String ans = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            ans += getRandomLetter();
        }
        ans += (char)(r.nextInt(10) + '0');
        return ans;
    }

    public static char getRandomLetter() {
        Random r = new Random();
        boolean isUpperCase = r.nextBoolean();
        if (isUpperCase) {
            return (char)('A' + r.nextInt(26));
        } else {
            return (char)('a' + r.nextInt(26));
        }
    }
}

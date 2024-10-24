package ticket;

import java.util.Scanner;

/**
 * 1. 机票价格计算类
 * 2. 机票价格按照淡季旺季、头等舱或经济舱收费
 * 3. 输入机票原价、月份和头等舱或经济舱，按照如下规则计算机票价格：
 * 旺季（5-10月）头等舱9折，经济舱8.5折；淡季（11-4月）头等舱7折，经济舱6.5折。
 *
 */
public class TicketCalculator {
    public static final double OFF_SEASON_FIRST_CLASS_DISCOUNT = 0.7;
    public static final double OFF_SEASON_ECONOMY_CLASS_DISCOUNT = 0.65;
    public static final double HIGH_SEASON_FIRST_CLASS_DISCOUNT = 0.9;
    public static final double HIGH_SEASON_ECONOMY_CLASS_DISCOUNT = 0.85;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原始机票价格: ");
        double originalPrice = sc.nextDouble();
        System.out.println("请输入月份: ");
        int month = sc.nextInt();
        System.out.println("请输入机舱类型: ");
        String type = sc.next();
        System.out.println("price: " + ticketPrice(originalPrice, month, type));
    }

    /**
     *
     * @param originalPrice 原始票价
     * @param month 月份
     * @param type 机舱类型，经济舱或者头等舱
     * @return 返回计算后的机票价格
     */
    public static double ticketPrice(double originalPrice, int month, String type) {
        double price = 0.0;
        if (month >= 5 && month <= 10) {
            // 旺季
            price = getPrice(originalPrice, type, HIGH_SEASON_ECONOMY_CLASS_DISCOUNT, HIGH_SEASON_FIRST_CLASS_DISCOUNT);
        } else {
            // 淡季
            price = getPrice(originalPrice, type, OFF_SEASON_ECONOMY_CLASS_DISCOUNT, OFF_SEASON_FIRST_CLASS_DISCOUNT);
        }

        return price;
    }

    public static double getPrice(double originalPrice, String type, double discount1, double discount2) {
        return switch (type) {
            case "经济舱" -> originalPrice * discount1;
            case "头等舱" -> originalPrice * discount2;
            default -> originalPrice;
        };
    }
}

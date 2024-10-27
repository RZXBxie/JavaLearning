package objectOriented;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "小米";
        phone.price = 9999.99;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        phone.call();
        phone.playGame();
    }

}

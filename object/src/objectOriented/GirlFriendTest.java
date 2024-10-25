package objectOriented;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        gf.setName("小诗诗");
        gf.setAge(19);
        gf.setGender("萌妹子");
        System.out.println("姓名: " + gf.getName());
        System.out.println("年龄: " + gf.getAge());
        System.out.println("性别: " + gf.getGender());
        gf.eat();
        gf.sleep();
    }
}

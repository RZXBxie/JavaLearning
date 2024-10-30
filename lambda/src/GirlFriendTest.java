import java.util.Arrays;

public class GirlFriendTest {
	public static void main(String[] args) {
		GirlFriend[] girlFriends = {
				new GirlFriend("lijim", 22, 170.0),
				new GirlFriend("lesiyuan", 21, 165.0),
				new GirlFriend("huanjin", 22, 162.5),
		};
		Arrays.sort(girlFriends, (a, b) -> {
			if (a.getAge() != b.getAge()) return a.getAge() - b.getAge();
			if (a.getHeight() != b.getHeight()) return (a.getHeight() - b.getHeight()) > 0 ? 1 : -1;
			return a.getName().compareTo(b.getName());
		});
		System.out.println(Arrays.toString(girlFriends));
	}
}

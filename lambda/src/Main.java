import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Integer[] array = {2, 3, 4, 5, 6, 10, 1, 8};
		// 匿名内部类实现排序规则
		Arrays.sort(array, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		// lambda表达式完整格式
		Arrays.sort(array, (Integer a, Integer b) -> {
			return a - b;
		});

		// lambda表达式省略写法
		Arrays.sort(array, (a, b) -> a - b);

		String[] strs = {"aaa", "a", "aa", "aaaa"};
		Arrays.sort(strs, (a, b) -> a.length() - b.length());
		System.out.println(Arrays.toString(strs));
	}
}
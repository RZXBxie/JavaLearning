import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		int[] array = {2, 5, 4, 1, 3};
		// popSort(array);
		// selectSort(array);
		// insertSort(array);
		quickSort(array, 0, array.length - 1);
		for (int num : array) {
			System.out.printf(num + " ");
		}
		System.out.println();
		Integer[] nums = {2, 5, 4, 1, 3};
		Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		for (int num : nums) {
			System.out.printf(num + " ");
		}
	}

	/**
	 * <p>冒泡排序</p>
	 * 基本思想：两两比较相邻的两位数，将大的放在后面
	 * @param array 传入的无序数组
	 */
	public static void popSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; ++i) {
			for (int j = 0; j < n - i - 1; ++j) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	/**
	 * <p>插入排序</p>
	 * 基本思想：从后面的无序的子数组中选择一个值，在前面有序的数组中找到它应该插入的位置
	 * @param array 传入的无序数组
	 */
	public static void insertSort(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	/**
	 * <p>选择排序</p>
	 * 基本思想：从0索引开始，每次都跟后面的数据进行比较，小的放前面，大的放后面
	 * @param array 传入的无序数组
	 */
	public static void selectSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
		}
	}

	public static void quickSort(int[] array, int left, int right) {
		if (left >= right) return;
		int pivot = array[(left + right) / 2];
		int i = left - 1, j = right + 1;
		while (i < j ) {
			do i++; while (array[i] < pivot);
			do j--; while (array[j] > pivot);
			if (i < j) {
				swap(array, i, j);
			}
		}
		quickSort(array, left, j);
		quickSort(array, j + 1, right);
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
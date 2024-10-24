package two_dimensional_array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 1.二维数组静态初始化
        // 数据类型[][] 数组名 = new 数据类型[][] {{元素1， 元素2}, {元素1, 元素2}};
        int[][] array = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        // 2.二维数组动态初始化
        // 数据类型[][] 数组名 = new 数据类型[m][n]
        int[][] array2 = new int[3][2];
        array2[0][0] = 1;
    }
}

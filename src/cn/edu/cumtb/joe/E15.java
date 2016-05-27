package cn.edu.cumtb.joe;

import java.util.Scanner;

/**
 * Created by  Administrator Joe Wang, tbpwang@gmail.com
 * 2016/4/15.
 * function: 15. 输入三个整数x，y，z，请把这三个数由小到大输出。
 */
public class E15 {
    public static void sort (int x, int y, int z){
        int min = (x <= y)? ((x <= z)? x : z) : ((y <= z)? y : z);
        int max = (x >= y)? ((x >= z)? x : z) : ((y >= z)? y : z);
        int middle = x + y + z - min - max;
        System.out.println(min + "  " + middle + "  " + max);
    }

    public static void sort2 (int x, int y, int z) {
        int temp;
        int[] arr = new int[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if ( arr[i] >= arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }

    public static void main(String[] args) {
        System.out.println("Input 3 integer :");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        sort(x, y, z);
        System.out.println("-------------------------");
        sort2(x, y, z);
    }
}

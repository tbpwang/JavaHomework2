package cn.edu.cumtb.joe;

import java.util.Scanner;

/**
 * Created by  Administrator Joe Wang, tbpwang@gmail.com
 * 2016/4/15.
 * Function:
 * 28. 对10个数进行排序。
 */
public class E28 {
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < 3; j++) {
                if ( arr[i] >= arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Input 10 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        int i = 0;
        while (scanner.hasNext()) {
            number[i] = scanner.nextInt();
            i++;
        }
        sort(number);
    }
}

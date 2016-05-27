package cn.edu.cumtb.joe;

import java.util.Scanner;

/**
 * Created by  Administrator Joe Wang, tbpwang@gmail.com
 * 2016/4/15.
 * function:
 * 19. 打印出如下图案（菱形）
 要求只使用以下三种语句
 1. System.out.print(" ")
 2. System.out.print("x");
 3. System.out.println("x")
 */
public class E19 {

    public static int odd(int max) {
        if (max % 2 != 0) {
            return max;
        } else {
            return max + 1;
        }
    }

    public static void diamond( int max) {
        int line = odd(max);
        if (line == 1) {
            System.out.println("x");
            return;
        }
        //Up line / 2
        for (int i = 1; i < line + 1; i++) {
            for (int j = 0; j < (line - (2 * i - 1)) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (2 * i - 1); j++) {
                System.out.print("x");
            }
            System.out.println("x");
            if(i == (line + 1) / 2) {
                break;
            }
        }

        //down line/2
        for (int i = (line + 1) / 2 - 1; i > 0; i--) {
            for (int j = 0; j < (line - (2 * i - 1)) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (2 * i - 1); j++) {
                System.out.print("x");
            }
            System.out.println("x");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input a number for lines: ");
        Scanner scanner = new Scanner(System.in);
        int max  = scanner.nextInt();
        System.out.println("Display " + odd(max) + " line(s)");
        diamond(max);
    }
}

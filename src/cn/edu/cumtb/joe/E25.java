package cn.edu.cumtb.joe;

import java.util.Scanner;

/**
 * Created by  Administrator Joe Wang, tbpwang@gmail.com
 * 2016/4/15.
 * Function:
 * 25. 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相
 同。
 */
public class E25 {
    private static int a; // abcde
    private static int b;
    private static int c;
    private static int d;
    private static int e;
     private static void digit (int number) {
         if (number >= 10000 && number <= 99999) {
             a = number / 10000;
             b = number / 1000 % 10;
             c = number / 100 % 10;
             d = number / 10 % 10;
             e = number % 10;
             System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
         }else {
             System.out.println("Wrong Number[5 digit number]");
             System.exit(0);
         }
     }

    private static boolean palindrome (int number) { //回文
        digit(number);
        if (a == e && b == d) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input a number of  5 digits");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Number " + number + ((palindrome(number))? " is a palindrome.":" is NOT a palindrome."));
    }
}

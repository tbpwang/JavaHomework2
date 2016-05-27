package cn.edu.cumtb.joe;

import java.util.Scanner;

/**
 * Created by  Administrator Joe Wang, tbpwang@gmail.com
 * 2016/4/14.
 * Function: 14. 输入某年某月某日，判断这一天是这一年的第几天？(闰年： 西元年份除以400余数为0
 * 的，或者除以4为余数0且除以100不为余数0的，为闰年。)
 */
public class E14 {
    private static int date; //YYYYMMDD
    private static int dayOrder() {
        int month = 0;
        int day = 0;
        int order;
        int january = 31;
        int february = (leap(date))? 29 : 28;
        int march = 31;
        int april = 30;
        int may = 31;
        int june = 30;
        int july = 31;
        int august = 31;
        int september = 30;
        int october = 31;
        int november = 30;
//        int december = 31;

//        month = (String.valueOf(date)).substring(4,6);
//        day = (String.valueOf(date)).substring(6);
        if (date > 10000) {
            month = (date % 10000) / 100;
            day = date % 100;
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
        }else {
            System.out.println("Error date!");
            System.exit(0);
        }
         switch (month) {
             case 1:
                 order = day;
                 break;
             case 2:
                 order = january + day;
                 break;
             case 3:
                 order = january + february + day;
                 break;
             case 4:
                 order = january + february + march + day;
                 break;
             case 5:
                 order = january + february + march + april + day;
                 break;
             case 6:
                 order = january + february + march + april + may + day;
                 break;
             case 7:
                 order = january + february + march + april + may + june + day;
                 break;
             case 8:
                 order = january + february + march + april + may + june + july + day;
                 break;
             case 9:
                 order = january + february + march + april + may + june + july + august + day;
                 break;
             case 10:
                 order = january + february + march + april + may + june + july + august + september + day;
                 break;
             case 11:
                 order = january + february + march + april + may + june + july + august + september + october + day;
                 break;
             case 12:
                 order = january + february + march + april + may + june + july + august + september + october + november + day;
                 break;
             default:
                 order = 0;
                 break;
         }
        return order;
    }

    private static boolean leap(int date) {
        if(date > 10000) {
            int year =date / 10000;
            System.out.println("The year is " + year);
            if((year % 4 == 0 && year % 100 != 0) ||year % 400 == 0) {
                return true;
            }else {
                return false;
            }
        }else {
            System.out.println("Input date(YYYYMMDD): ");
            System.exit(0);
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input date [YYYYMMDD]");
        Scanner scanner = new Scanner(System.in);
        date = scanner.nextInt();
        System.out.println(leap(date));
        System.out.println("The order is " + dayOrder());
    }
}

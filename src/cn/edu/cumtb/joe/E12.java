package cn.edu.cumtb.joe;

import java.util.Scanner;

/**
 * Created by Joe Wang on 2016/4/14.
 * function: 12、企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于
 * 10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成
 * 7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40
 * 万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于
 * 100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总
 * 数？
 */
public class E12 {
    private static int profit;

    public static double bonus(){
        if(profit <= 0){
            System.out.println("Input Profit");
            return 0;
        }else if(profit <= 10){
            return 0.1 * profit ;
        }else if(profit <= 20){
            return 1 + (profit - 10) * 0.075;
        }else if(profit <= 40){
            return 1 + 10 * 0.075 + (profit - 20) * 0.05;
        }else if(profit <= 60){
            return 1 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
        }else if(profit <= 100){
            return 1 + 10 * 0.075 + 20 * 0.05 + 40 * 0.03 + (profit - 60) * 0.015;
        }else {
            return 1 + 10 * 0.075 + 20 * 0.05 + 40 * 0.03 + 40 * 0.015 + (profit - 100) * 0.01;
        }
    }


    public static void main(String[] args) {
        System.out.println("Input Profit:(Million ￥)");
        Scanner scanner = new Scanner(System.in);
        profit = scanner.nextInt();
        System.out.println("Your bonus is: " + bonus() + " Million ￥");

    }

}

package cn.edu.cumtb.joe;

/**
 * Created by  Administrator Joe Wang, tbpwang@gmail.com
 * 2016/4/14.
 * Function:13. 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数
 * 是多少？
 */
public class E13 {
    public static final int TOP = 10000000;
    public static void square(){
        long tem1;
        long tem2;
        for (int i = 0; i < TOP; i++) {
            tem1 =(long) Math.sqrt(i + 100);
            tem2 = (long)Math.sqrt(i + 100 + 168);
            if ((tem1 * tem1 == (i + 100)) && (tem2 * tem2 == (i + 100 + 168))) {
                System.out.print("  " + i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The number(1-" + TOP + ") are :");
        square();
    }

}

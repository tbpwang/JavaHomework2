import java.util.Scanner;

/**
 * Created by Joe Wang on 2016/4/7.
 * 9 一个数如果恰好等于它的因子之和，这个数就称为’完数’。例如6=1＋2＋3.编程 找出1000以内的所有完数。
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int s;
        System.out.println("Perfect numbers are: ");
        for(int i = 1; i < 1000; i++){
            s = 0;
            for(int j = 1; j < i; j++) {
                if(i % j == 0){
                    s += j;
                }
            }
            if(s == i){
                System.out.print( i + " ");
            }
        }
    }
}


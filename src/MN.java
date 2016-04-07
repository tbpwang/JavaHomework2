import java.util.Scanner;

/**
 * Created by Joe Wang on 2016/4/7.
 * 6 输入两个正整数m和n，求其最大公约数和最小公倍数。
 */
public class MN {
    public static void main(String[] args) {
        int m; int n;
        System.out.println("输入两个正整数m和n");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int min = m <= n ? m : n;
        int max = m>= n ? m : n;
        int greatestCommonDivisor = 0;
        int leastCommonMultiple = 0;
        if(min <= 0){
            System.out.println("需要输入正整数");
        }else{
            for(int i = 1; i <= min; i++){
                if((m % i == 0) && (n % i == 0) ) {
                    greatestCommonDivisor = i;
                }
            }
            System.out.println("最大公约数(" + m + "、 " + n + ") = " + greatestCommonDivisor);
            while(max > 0){
                if((max % m == 0) && (max % n == 0) ){
                    leastCommonMultiple = max;
                    break;
                }
                max++;
            }
            System.out.println("最小公倍数[" + m + ", " + n + "] = " + leastCommonMultiple);
        }

    }
}

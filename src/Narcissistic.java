/**
 * Created by Joe Wang on 2016/3/28.
 * Function：3.打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个“水仙花数’，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Narcissistic{
    public static void main(String[] args) {
        System.out.println("打印水仙花数");
        System.out.println("The Narcissistic are:");
        int a = 0;  //个位
        int b = 0;  //十位
        int c = 0;  //百位
        boolean isNarcissistic = false;
        int nunmber = 0;
        for (int i = 152; i < 1000; i++) {
            a = i % 10;
            b = (i / 10) % 10;
            c = i / 100;
            if((a * a * a + b * b * b + c * c * c) == i){
                isNarcissistic =true;
                nunmber += 1;
                System.out.println(i);
            }

        }
        System.out.println("The total number is :");
        System.out.println(nunmber);

    }
}

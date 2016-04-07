/**
 * Created by Joe Wang on 2016/3/28.
 * Function：2. 判断101-200之间有多少个素数，并输出所有素数。素数：只能被1和它本身整除的正整数（1不是素数）
 */

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 0;

        System.out.println("The prime number between 101-200 are:");
        for (int i = 101; i < 201; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i / 2; j++) {
               if ((i % j) == 0){
                   isPrime=false;
                   break;
               }
            }
            if(isPrime==true){
                number += 1;
                System.out.println(i);
            }
        }
        System.out.println("The total number is:");
        System.out.println(number);
    }
}

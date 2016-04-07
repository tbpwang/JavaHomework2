import java.util.Scanner;

/**
 * Created by Joe Wang  on 2016/3/28.
 * Function: 4.将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。
 */
public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a positive integer number: ");
        int inputNum = in.nextInt();

        System.out.print("The factors of number ");
        System.out.print(inputNum);
        System.out.print(" = ");
        Integer[] a = new Integer[inputNum / 2];
        int j = 0;
        for (int i = 2; i <= inputNum; i++) {
            if ((inputNum % i) == 0) {
                a[j++] = i;
                inputNum /= i;
                i--;
            }

        }
        if (a[0] != null) {
            System.out.print(a[0]);
            for (int i = 1; i < j; i++) {
                System.out.print(" * " + a[i]);
            }
        } else {
            System.out.println("No Factor!");
        }
    }
}

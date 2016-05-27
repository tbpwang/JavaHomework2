package cn.edu.cumtb.joe;

/**
 * Created by  Administrator Joe Wang, tbpwang@gmail.com
 * 2016/4/15.
 * function: 16. 输出9*9口诀。
 */
public class E16 {
    public static void multTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        multTable();
    }
}

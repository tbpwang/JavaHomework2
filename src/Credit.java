import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Joe Wang on 2016/4/7.
 * 5\利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */
public class Credit {
    public static void main(String[] args) {
        System.out.println("Input a score");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char grade;
        grade = (score >= 90) ? 'A' : ((score >= 60) ? 'B' : 'C');
        System.out.println("Credit is  " + grade);
    }
}

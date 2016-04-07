import java.util.Scanner;

/**
 * Created by Joe Wang on 2016/4/7.
 * 7 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
public class Statistics {
    public static void main(String[] args) {
        int alphabets = 0;
        int blanks  = 0;
        int numbers = 0;
        int others = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一串字符");
        String instr = sc.nextLine();
        char[] ch = instr.toCharArray();
        for(int i = 0; i < ch.length; i ++){
            if(Character.isLetter(ch[i])){
                if(ch[i] >= 'a' && ch[i] <='z' || ch[i] >= 'A' && ch[i] <= 'Z'){
                    alphabets++;
                }else {
                    others++;
                }
            }else if(Character.isSpaceChar(ch[i])){
                blanks++;
            }else if(Character.isDigit(ch[i])){
                numbers++;
            }else{
                others++;
            }
        }
        System.out.println("输入的字符串中共有英文字母："+ alphabets);
        System.out.println("输入的字符串中共有空格："+ blanks);
        System.out.println("输入的字符串中共有数字："+ numbers);
        System.out.println("输入的字符串中共有其他字符："+ others);
    }
}

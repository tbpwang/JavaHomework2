/**
 * Created by Joe Wang on 2016/4/7.
 * 11 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
 */
public class Permutations {
    public static void main(String[] args) {
        int cout = 0;
        int permutations = 0;
        for(int i = 1; i <= 4; i ++){
            for(int j = 1; j <= 4; j++){
                if(j != i){
                    for(int k = 1; k <= 4; k++){
                        if(k != j && k != i){
                            cout++;
                            permutations = i * 100 + j * 10 + k;
                            System.out.println("三位数组合为 " + permutations);
                        }
                    }
                }
            }
        }
        System.out.println("共有不同三位数组合 " + cout +  " 个");
    }
}

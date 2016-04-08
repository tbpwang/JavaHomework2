import java.util.Random;

/**
 * Created by Joe Wang on 2016/4/7.
 * 34 随机生成[1， 20]数10000次，使用两种方法实现（java.lang.Math，java.util.Random），并判断两种方法的效率和分布。
 */
public class RandomTest {
    public static void main(String[] args) {
        int count = 10000;
        double[] mathRd = new double[count];
        double[] rdNumber = new double[count];
        double mathAvg = 0;
        double rdAvg = 0;
        Random rd = new Random();
        long rdStartTime = System.currentTimeMillis();
        for(int i = 0; i < count; i++){
            rdNumber[i] = rd.nextDouble() * 19 + 1;
            rdAvg += rdNumber[i];
        }
        long rdEndTime = System.currentTimeMillis();

        long mathStartTime = System.currentTimeMillis();
        for(int i = 0; i < count; i++){
            mathRd[i] = Math.random() * 19 + 1;
            mathAvg += mathRd[i];
        }
        long mathEndTime = System.currentTimeMillis();
        System.out.println("随机函数的【1-20】随机数平均值为：" + rdAvg / count);
        System.out.println("随机函数的【1-20】随机数平均用时为：" + (rdEndTime - rdStartTime));
        System.out.println("数学随机方法的【1-20】随机数平均值为：" + mathAvg / count);
        System.out.println("数学随机方法的【1-20】随机数平均用时为：" + (mathEndTime - mathStartTime));
    }
}

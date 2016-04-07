/**
 * Created by Joe Wang on 2016/4/7.
 * 10  一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class FreeFalling {
    public static void main(String[] args) {
        double height = 100;
        double S = 0;
        for(int i = 1; i<= 10; i++){
            S += height;
            height /= 2;
        }
        System.out.println("10次共经过 " + S + "米");
        System.out.println("第10次反弹的高度为 " + height + "米");
    }
}

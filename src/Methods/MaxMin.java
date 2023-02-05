package Methods;

public class MaxMin {

    public static int getMax(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }

    public static int getMin(int num1, int num2, int num3){
        return Math.min(Math.min(num1, num2), num3);
    }
}

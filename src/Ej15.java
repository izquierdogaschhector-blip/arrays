import java.lang.reflect.Array;
import java.util.Arrays;

public class Ej15 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int[] num2 = {};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j--) {
                System.out.println("La copia de "+Arrays.toString(num)+" en orden inverso es "+Arrays.toString(num2));
            }
        }
    }
}

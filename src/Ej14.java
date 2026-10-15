import java.util.Arrays;
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int pos = 2;

        for (int i = pos; i < num.length - 1; i++) {
            num[i] = num[i+1];
        }
        num[num.length - 1] = 0;
        System.out.println(Arrays.toString(num));
    }
}

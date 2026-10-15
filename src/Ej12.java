public class Ej12 {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,1,2,3,4};
        int[] num2 = {1,5,4,2,9,8};
        int numeros = 0;
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    numeros = num1[i];
                    System.out.println("Los elementos comunes son "+numeros) ;
                }
            }
        }
    }
}

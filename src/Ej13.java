public class Ej13 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int suma = 5;
        int operacion = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] + num[j] == suma) {
                    System.out.println("La suma tiene el "+num[i]+" y el "+num[j]+" y da "+suma);
                }

            }
        }
    }
}
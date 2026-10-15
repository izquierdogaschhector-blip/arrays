public class Ej11 {
    public static void main(String[] args) {
        int[] num = {1,5,9,8,5,9};
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println("El número "+num[i]+ " está duplicado");
                }
            }
        }
    }
}

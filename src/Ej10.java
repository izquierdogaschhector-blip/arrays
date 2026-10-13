public class Ej10 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int numquebuscar = 5;
        int indice = -1;
        for (int i = 0; i < num.length; i++) {
            if (numquebuscar == num[i] ) {
                indice = i+1;
            }
        }

        System.out.println("Está en " + indice);

    }
}

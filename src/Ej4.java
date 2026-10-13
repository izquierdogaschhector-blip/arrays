public class Ej4 {
    public static void main(String[] args) {
        int[] media = {1,2,8,9,10};
        double suma = 0;
        for (int i = 0; i < media.length; i++){
            suma = suma + media[i];
        }
        System.out.println("La media es: "+ (suma/media.length));
    }
}

public class Ej5 {
    public static void main(String[] args) {
        int[] maximo = {5,6,8,7,9,10,1,3,12,2};
        int mayor = maximo[0];
        for (int i = 0; i < maximo.length; i++) {
            if (maximo[i]>mayor) {
                mayor = maximo[i];
            }
        }
        System.out.println("El número máximo es: "+mayor);

    }
}

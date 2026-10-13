public class Ej3 {
    public static void main(String[] args) {
        int num_dni = 12500495;
        String[] letras = {"T", "R","W", "A","G","M","Y","F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
            int resto = num_dni % 23;
            String letra = letras[resto];
            System.out.println("La letyra del dni es: "+letra);
            }
    }

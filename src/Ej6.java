public class Ej6 {
    public static void main(String[] args) {
        int[] menor = {5,9,7,2,1,2,15};
        int peque = menor[0];
        // pongo 1 en el int i = x porque ya esta asignado en el peque que el menor es el 0, asi que empiezo por el siguiente.
        for (int i = 1; i < menor.length; i++) {
            if (menor[i]<peque){
                peque = menor[i];
            }
        }
        System.out.println("El numero menor es: "+peque);
    }
}

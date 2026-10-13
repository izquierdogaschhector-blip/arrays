public class Ej8 {
    public static void main(String[] args) {
        int[] num = {1,-9,3,-2,5,6,-5,8,-6,10};
        int sumapositivos = 0;
        int sumanegativos = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i] >= 0) {
                sumapositivos += num[i];
            }else{
                sumanegativos += num[i];
            }
        }
    }
}

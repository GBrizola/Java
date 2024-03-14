public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,0};

        System.out.println("Vetores inversos: ");

        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i] + "\n");
        }
    }
}
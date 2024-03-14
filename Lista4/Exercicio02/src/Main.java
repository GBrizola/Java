public class Main {
    public static void main(String[] args) {

        int[] numeros = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("Os números pares soma 2 e os impares multiplica por 2: ");

        for (int i = 0; i < numeros.length; i++) {
           if(i % 2 == 0)
                numeros[i] += 2;
            else
                numeros[i] *= 2;

            System.out.print(numeros[i] + ", ");
        }
    }
}
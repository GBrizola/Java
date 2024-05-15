import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para verificar se é um palíndromo:");
        String str = scanner.nextLine();

        if (isPalindromo(str)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }
    static boolean isPalindromo(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return isPalindromoRecursivo(str, 0, str.length() - 1);
    }

    static boolean isPalindromoRecursivo(String str, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (str.charAt(inicio) != str.charAt(fim)) {
            return false;
        }
        return isPalindromoRecursivo(str, inicio + 1, fim - 1);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,prim,seg,result;
        System.out.print("Digite um valor para gerar a sequência de Fibonacci: ");
        n = in.nextInt();

        System.out.println("A sequência de Fibonacci até o " + n + "º termo é:");
        prim = 0;
        seg = 1;
        result = 0;

        if (n >= 1) {
            System.out.print(prim + " ");
        }
        if (n >= 2) {
            System.out.print(seg + " ");
        }
        for (int i = 2; i < n; i++) {
            result = prim + seg;
            prim = seg;
            seg = result;
            System.out.print(result + " ");
        }
    }
}

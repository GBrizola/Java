public class Main {
    public static void main(String[] args) {
        int [] [] matriz = {{1,2,3,4,5},
                            {2,3,4,5,6},
                            {6,7,8,9,0},
                            {0,9,8,7,6},
                            {5,4,3,2,1}};
        diag_secundario(matriz);
    }
    static void diag_secundario(int [][]m){
        if(m.length == m[0].length){
            for(int i = m.length - 1; i >= 0 ; i--){
                System.out.print(m[m.length - 1 - i][i] + ", ");
            }
        }
        else {
            System.out.println("A matriz não é quadrada!");
        }
    }
}
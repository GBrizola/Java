public class Main {
    public static void main(String[] args) {
        int [] [] matriz = {{1,2,3,4,5},
                            {2,3,4,5,6},
                            {6,7,8,9,0},
                            {0,9,8,7,6},
                            {5,4,3,2,1}};
        diag_principal(matriz);

    }
    static void diag_principal(int [][]m){
        if(m.length == m[0].length){
            for(int i = 0; i < m.length; i++){
                System.out.print(m[i][i] + ", ");
                }
            }
    }
}
public class Main {
    public static void main(String[] args) {
        int [] [] matriz = {{1,2,3,4,5},
                            {2,3,4,5,6},
                            {6,7,8,9,0},
                            {0,9,8,7,6},
                            {5,4,3,2,1}};
        System.out.println("Diagonal secundaria da matriz: " + matriz[0][4] + " " + matriz[1][3] + " " + matriz[2][2] + " " +
                matriz[3][1] + " " + matriz[4][0]);
    }
}
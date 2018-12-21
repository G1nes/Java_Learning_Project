package Tasks;

import java.util.Scanner;

public class NinthTask {
    //матрица какого размера требуется?
    public static void main (String [] args){
        int [] [] matrix = new int [2] [4];
        Scanner s = new Scanner(System.in);
        for (int i=0;i<2;i++){
            for (int q =0;q<4;q++){
                matrix [i][q] = s.nextInt();
            }
        }
        for (int i=0;i<2;i++){
            for (int q =0;q<4;q++){
                System.out.print(matrix [i] [q]*3+" ");

            }
            break;
        }
    }
}

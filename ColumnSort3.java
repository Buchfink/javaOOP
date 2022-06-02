import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ColumnSort3 {

    public static void main(String[] args) {

        /// get matrix dimension from console
        System.out.printf("Введите количество столбцов: ");
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();

//        Integer n = 4;
//        Integer rnd[][]=  {{9,1,7,2},{6,5,4,1},{1,2,3,9},{1,4,3,9}};
        Integer rnd[][] = new Integer[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                rnd[i][j] = new Random().nextInt(11)-5;
                System.out.print(rnd[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        Integer proxy[] = new Integer[n];
        //sort by column 2 (index =1)
        Integer k=1;
        //ascending
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if(rnd[i][k] > rnd[j][k]){
                    for(int m=0; m<n; m++) {
                        proxy[m] = rnd[j][m];
                        rnd[j][m] = rnd[i][m];
                        rnd[i][m] = proxy[m];
                    }
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(rnd[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

//        descending
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if(rnd[i][k] < rnd[j][k]){
                    for(int m=0; m<n; m++) {
                        proxy[m] = rnd[j][m];
                        rnd[j][m] = rnd[i][m];
                        rnd[i][m] = proxy[m];
                    }
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(rnd[i][j] + " ");
            }
            System.out.println();
        }
    }
}

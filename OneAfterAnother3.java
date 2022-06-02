import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneAfterAnother3 {

    public static void main(String[] args) {

        /// get matrix dimension from console
//        System.out.printf("Введите количество столбцов: ");
//        Scanner in = new Scanner(System.in);
//        Integer n = in.nextInt();

        Integer n = 4;
        Integer rnd[][]=  {{9,1,2,7},{6,5,4,1},{1,2,3,9},{1,4,3,9}};
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
//                rnd[i][j] = new Random().nextInt(10);
                System.out.print(rnd[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        Integer previous;
        Integer control=0;
        ArrayList<Integer> cons = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
            previous = rnd[i][0]; //take first element in row i
            for (int j=1; j<n; j++){        //check if next element = previous+1
                if(rnd[i][j] == previous+1){
                    if(cons.size()==0){
                        cons.add(previous);
                    }
                    previous = rnd[i][j];
                    cons.add(previous);
                }
                else{
                    previous = rnd[i][j];
                    control = control + 1;
                }
            }
            if(cons.size()!= 0){
                System.out.println(cons);
                cons.clear();
            }
        }
        System.out.println();
    }
}

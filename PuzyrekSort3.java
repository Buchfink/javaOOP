import java.util.Arrays;
import java.util.Collections;

public class PuzyrekSort3 {

    public static void main(String[] args) {

        Integer[] inputArray = {3, 5, 2, 1, 4};
        Integer[] inputArray0 = {3, 5, 2, 1, 4};
        Integer[] inputArray1 = {3, 5, 2, 1, 4};
        Integer[] inputArray2 = {3, 5, 2, 1, 4};
        for(Integer num: inputArray){
            System.out.print(num + " ");
        }
        System.out.println();

        Integer proxy;
        //ascending
        for (int i=0; i<5-1; i++) {
            for (int j=i+1; j<5; j++) {
                if(inputArray[i]>inputArray[j]){
                        proxy = inputArray[j];
                        inputArray[j] = inputArray[i];
                        inputArray[i] = proxy;
                }
            }
        }
        for(Integer num: inputArray){
            System.out.print(num + " ");
        }
        System.out.println();
        //descending
        for (int i=0; i<5-1; i++) {
            for (int j=i+1; j<5; j++) {
                if(inputArray0[i]<inputArray0[j]){
                    proxy = inputArray0[j];
                    inputArray0[j] = inputArray0[i];
                    inputArray0[i] = proxy;
                }
            }
        }
        for(Integer num: inputArray0){
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.sort(inputArray1);
        System.out.println(Arrays.toString(inputArray1));

        Arrays.sort(inputArray2, Collections.reverseOrder());
        System.out.println(Arrays.toString(inputArray2));
    }
}

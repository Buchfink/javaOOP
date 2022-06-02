import javafx.beans.binding.MapBinding;
import javafx.collections.ObservableMap;

import java.util.*;

public class PrintAcceding2 {

    public static void main(String[] args) {

        ArrayList<String> input= new ArrayList<String>();
        int n =5;
        String [] inputArray = new String [n];
//        Integer[] inputLength = new Integer[n];
//        Map<String,Integer> numLength = new HashMap<String,Integer>();
        System.out.printf("Введите %d чисел:", n);
        Scanner in = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            String s = in.nextLine();
                input.add(s);
                inputArray[i] = s;
//                inputLength[i] = s.length();
//                numLength.put(s,s.length());
        }
        System.out.print("Unordered List: ");
        for (String s : input) {
            System.out.print(" " + s);
        }
        System.out.println();

        //descending length

        String minValue;
        for (int i=n-1; i>=1; i--){
            for (int y=0; y<n-1; y++){
                if(inputArray[y].length()<inputArray[y+1].length()){
                    minValue = inputArray[y];
                    inputArray[y]=inputArray[y+1];
                    inputArray[y+1] = minValue;
                }
            }
        }

        System.out.println();

        System.out.print("Ordered Array: ");
        for (String s : inputArray) {
            System.out.print(" " + s);
        }
        //ascending length

        String maxValue;
        for (int i=n-1; i>=1; i--){
            for (int y=0; y<n-1; y++){
                if(inputArray[y].length()>inputArray[y+1].length()){
                    maxValue = inputArray[y];
                    inputArray[y]=inputArray[y+1];
                    inputArray[y+1] = maxValue;
                }
            }
        }

        System.out.println();

        System.out.print("Ordered Array: ");
        for (String s : inputArray) {
            System.out.print(" " + s);
        }
    }

}

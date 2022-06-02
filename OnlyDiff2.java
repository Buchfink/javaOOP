import java.util.ArrayList;
import java.util.Scanner;

public class OnlyDiff2 {

    public static void main(String[] args) {

        ArrayList<String> input= new ArrayList<String>();
        int n =5;
        String [] inputArray = new String [n];
        System.out.printf("Введите %d чисел:", n);
        Scanner in = new Scanner(System.in);

        for (int i=0; i<n; i++) {
            String s = in.nextLine();
                input.add(s);
                inputArray[i] = s;
        }
        in.close();

//find min diff
        Integer firstNumber=0;
        Integer countEvenEqualsOdd=0;

        for (int i=0; i<n; i++) {
            String s = inputArray[i];
            Integer length =s.length();
            Integer maxVal=0;
            if (length >1){
                for (Integer j = 0; j < length; j=j+1) {
                    String num = String.valueOf(s.charAt(j));
                    if (!s.substring(j+1).contains(num)) {
                        maxVal++;
                    }
                    else{
                        j=length;
                        maxVal=-1;
                    }
                }
                if (maxVal>=0){
                    System.out.println("Only different numbers " + s);
                }
            }
            else {
                System.out.println("Only single number " + s);
            }
        }
    }
}

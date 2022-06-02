import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd2 {

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
        Integer countOnlyEven=0;
        Integer countEvenEqualsOdd=0;
        for (int i=0; i<n; i++) {
            String s = inputArray[i];
            Integer countOdd =0;
            for (Integer j = 1; j < 10; j=j+2) {
                String c = Integer.toString(j);
                if (s.contains(c)) {
                    countOdd++;
                }
            }
            if (countOdd==0){
                System.out.println("Only even numbers " + s);
                countOnlyEven++;
            }
            else {
                if ((s.length() % 2) == 0) {
                    if (countOdd == s.length()/2) {
                        System.out.println("Same amount of even and odd " + s);
                        countEvenEqualsOdd++;

                    }
                }
            }
        }
        System.out.println("Total only even = " + countOnlyEven);
        System.out.println("Total Same amount of even and odd = " + countEvenEqualsOdd);
    }
}

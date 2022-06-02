import java.util.ArrayList;
import java.util.Scanner;

public class LessThanMid2 {

    public static void main(String[] args) {

        ArrayList<String> input= new ArrayList<String>();
        int n =5;
        Double sumLength=0.0;

        String [] inputArray = new String [n];
        System.out.printf("Введите %d чисел:", n);
        Scanner in = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            String s = in.nextLine();
                input.add(s);
                inputArray[i] = s;
                sumLength = sumLength + s.length();
        }
        in.close();

        double midLength = sumLength/5;
        System.out.println("Length sum = " + sumLength);
        System.out.println("Mean length = " + midLength);

        System.out.println("print numbers with length less than middle length");

        for(String s:input) {
            if (midLength>s.length()){
                System.out.println(s + "  " + s.length());
            }
        }

// print numbers with length more than middle length
        System.out.println("print numbers with length more than middle length");
        for(String s:input) {
            if (midLength<s.length()){
                System.out.println(s + "  " + s.length());
            }
        }

    }
}

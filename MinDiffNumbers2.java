import java.util.ArrayList;
import java.util.Scanner;

public class MinDiffNumbers2 {

    public static void main(String[] args) {

        ArrayList<String> input= new ArrayList<String>();
        int n =5;
        Double sumLength=0.0;

        String [] inputArray = new String [n];
        System.out.printf("Введите %d чисел:", n);
        Scanner in = new Scanner(System.in);
        Integer [] countDiff = new Integer[n];
        for (int i=0; i<n; i++) {
            String s = in.nextLine();
                input.add(s);
                inputArray[i] = s;
                ArrayList<Character> let = new ArrayList<Character>();
                for (int j=0; j<s.length(); j++){
                    if (!let.contains(s.charAt(j))){
                        let.add(s.charAt(j));
                    }
                }
                countDiff[i]=let.size();
        }
        in.close();

//find min diff
        Integer minDiff=countDiff[0];
        int indexOfminDiff=0;
        for(int i=1; i<n;  i++) {
            if (countDiff[i]<minDiff){
                minDiff = countDiff[i];
                indexOfminDiff = i;
            }
        }

        System.out.println("find min diff");
        System.out.println("min diff = " + minDiff);
        System.out.println("index of  min diff = " + indexOfminDiff);
        System.out.println("number with  min diff = " + inputArray[indexOfminDiff]);
    }
}

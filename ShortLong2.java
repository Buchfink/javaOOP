import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ShortLong2 {

    public static void main(String[] args) {

        ArrayList<String> input= new ArrayList<String>();
        int n =5;
        String [] inputArray = new String [n];
        System.out.printf("Введите %d чисел:", n);
        // получаем консоль
//        Console console = System.console();
//        for (int i=0; i<n; i++) {
//            if (console != null) {
//                // считываем данные с консоли
//                input.add(console.readLine());
//            }
//        }
        Scanner in = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            String s = in.nextLine();
                input.add(s);
                inputArray[i] = s;
        }
        in.close();

// longest and shortest
        //ArrayList
        int length;
        Integer longest=0;
        Integer shortest;
        String longestNumber="";
        String shortestNumber="";

        for(String s:input) {
            length = s.length();
            if (longest<=length){
                longest = length;
                longestNumber = s;
            }
        }
        shortest = longest;
        for(String s:input) {
            length = s.length();
            if (shortest>=length){
                shortest = length;
                shortestNumber = s;
            }
        }
        System.out.println("Longest = " + longest);
        System.out.println("Longest Number = " + longestNumber);
        System.out.println("Shortest = " + shortest);
        System.out.println("Shortest Number = " + shortestNumber);

        //Array
        Integer longestArray=0;
        Integer shortestArray = inputArray[0].length();
        for(String s:inputArray) {
            length = s.length();
            if (longestArray<=length){
                longestArray = length;
                longestNumber = s;
            }
            if (shortestArray>=length){
                shortestArray = length;
                shortestNumber = s;
            }
        }
        System.out.println("Longest = " + longestArray);
        System.out.println("Longest Number = " + longestNumber);
        System.out.println("Shortest = " + shortestArray);
        System.out.println("Shortest Number = " + shortestNumber);

        // write according to the length

    }
}

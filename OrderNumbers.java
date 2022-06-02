import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OrderNumbers {

    public static void main(String[] args) {

        /// Command line parameter in reverse order
        Integer length = args.length;
        for (int i=0; i<length; i++){
            System.out.print(args[length-1-i] + " ");
        }
        System.out.println();
        int i =1;
        for(String s:args) {
            System.out.print(args[length-i] + " ");
            i++;
        }
    }
}

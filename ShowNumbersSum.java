import java.util.Random;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class ShowNumbersSum {

    public static void main(String[] args) {

        Integer sum=0, prod=1;
        for(String s:args) {
            int in = parseInt(s);
            System.out.print(s + " ");
            sum = sum + in;
            prod = prod*in;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + prod);
    }
}

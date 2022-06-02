import java.util.Random;

import static java.lang.Integer.parseInt;

public class ShowrRndom {

    public static void main(String[] args) {

        /// Command line parameter in reverse order
        int length = parseInt(args[0]);
        int rnd[]= new int[length];
        for (int i=0; i<length; i++){
            rnd[i] = new Random().nextInt(10);
            System.out.println(rnd[i]);
        }
        System.out.println();
        for(int i:rnd) {
            System.out.print(i + " ");
        }
    }
}

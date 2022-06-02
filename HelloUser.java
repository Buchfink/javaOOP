import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloUser {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        //ise Name from arguments
        System.out.printf("Hello %s!",args[0]);
        System.out.println();

        System.out.println("Please type your name and press Enter.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader.readLine();
            System.out.println("Hello, " + name + "!");
        } catch(IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

      //  String name = System.console().readLine("Please type your name and press Enter%n");
     //   System.out.printf("Hello, %s!", name);

    }
}

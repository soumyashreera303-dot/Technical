package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4tryWithResources {
    public static void main(String[] args) throws IOException {
        String str;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter something: ");
            str = br.readLine();
            System.out.println("You entered!" + str);
        }
    }
}

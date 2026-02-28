package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br= null;
        try{
            br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter something: ");
            str = br.readLine();
            System.out.println("You entered ");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            br.close();

        }
    }
}

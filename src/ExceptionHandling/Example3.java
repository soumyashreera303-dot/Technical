package ExceptionHandling;

public class Example3 {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("Eligible- Access granted");
        }else{
            throw new RuntimeException("Not Eligible- Access Denied");
        }
    }
    public static void main(String[] args){
        checkAge(12);

    }
}

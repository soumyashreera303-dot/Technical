package ExceptionHandling;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}

class Driver{
    static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be above 18 years");
        }
        System.out.println("You can vote");
    }
    public static void main(String[] args){
        try{
            vote(25);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
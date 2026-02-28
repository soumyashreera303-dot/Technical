package ExceptionHandling;

public class Example3Bank {
    public static void main(String[] args){
        try{
            int balance = 2000;
            int withdraw = 3000;
            if(withdraw>balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            System.out.println("Withdraw Successfyl");
        }catch(ArithmeticException e){
            System.out.println("Exception caught "+ e.getMessage());
        }
    }
}

package ExceptionHandling;

public class OwnExException extends Exception {

    OwnExException(String msg){
        super(msg);
    }
}

class Example{
    static void Chocolates(int amount) throws OwnExException{
        if(amount>100){
            throw new OwnExException("This chocolate is expensive!!!!");
        }
        System.out.println("This chocolate is less expensive");
    }
    public static void main(String[] args){
        try{
            Chocolates(50);
        }catch (OwnExException e){
            System.out.println(e.getMessage());
        }
    }
}

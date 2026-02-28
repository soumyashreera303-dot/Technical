package ExceptionHandling;

public class ThrowalbleDemo {
    static void function() throws Throwable{
        throw new Throwable("Something went wrong");
    }
    public static void main(String[] args) {
        try{
            function();
        }catch (Throwable t){
            System.out.println(t.getMessage());
        }
    }
}

/*
Allowed:
throw new Exception("Error")
throw new RuntimeException("Error")
throw new Throwable("Message")

Not Allowed:
throw new String
throw new Integer
 */
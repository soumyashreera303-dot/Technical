package Assessment.Second;

public class TryCatchFinallyDemo {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
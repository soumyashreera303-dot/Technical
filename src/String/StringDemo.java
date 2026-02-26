package String;

public class StringDemo {
    static void main(String[] args) {
        String s1= "HELLO";
        String s2= "HELLO";
        String s3= new String("Hello");
        String s4= new String("Hello");
        System.out.println(s1==s2);//true
        System.out.println(s2==s3);//false
    }
}

package String;

public class StringImmutable {
    public static void main(String[] args) {
        String  str = "hello";
        str.concat("world");
        System.out.println(str);

        str= str.concat("World");
        System.out.println(str);
    }
}

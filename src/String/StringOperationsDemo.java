package String;

import java.sql.SQLOutput;

public class StringOperationsDemo {
    static void main(String[] args) {
        //Create Strings
        String s1= "Java Programming";
        String s2 = new String("Java Programming");

        System.out.println("Original string is "+ s1);

        //length()
        System.out.println("Length of the string is "+s1.length());

        //charAt()
        System.out.println("Character at index 2 is "+s1.charAt(2));

        //toUpperCase() and toLowerCase
        System.out.println("UPPERCASE " +s1.toUpperCase() );
        System.out.println("LOWERCASE " + s1.toLowerCase());

        //equals() and ==
        System.out.println("Using double equals(==): " + s1==s2 );
        System.out.println("Using equals(): "  +s1.equals(s2) );

        //compareTo()
        System.out.println("Using compareTo():" + s1.compareTo(s2));

        //substring()
        System.out.println("Substring (0to4): "+ s1.substring( 0,4));

        //contain()
        System.out.println("Contains 'Program': "+ s1.contains("Program"));

        //indexOf()
        System.out.println("Index of 'a': " + s1.indexOf('a'));

        //replace()
        System.out.println("Replace Java with Python: "+ s1.replace("Java", "Python"));
        System.out.println(s1);
        s1=s1.replace("Java", "Python");
        System.out.println("After replacement: " + s1);

        //StartWith() and endWith()
        System.out.println("Starts with Java: "+ s1.startsWith("Java"));
        System.out.println("Ends with ing: "+ s1.endsWith("ing"));

        //trim()
        String s3= "       happy            ";
        System.out.println("Before trim(): "+s3);
        System.out.println("After trim(): "+s3.trim());

        //concat()
        System.out.println("Concat(): "+ s1.concat(" Language"));

        //isEmpty() and isBlank()
        String str = " ";
        System.out.println("Is Empty?: "+str.isEmpty());
        System.out.println("Is Blank?: "+str.isBlank());

        //Split()
        String sentence = "Java is a very easy language to learn!!!";
        String[] arr = sentence.split(" ");
        System.out.println("After split(): ");
        for (String i: arr){//for each
           System.out.println(i);
        }
    }
}

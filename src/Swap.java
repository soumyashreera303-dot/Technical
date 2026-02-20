public class Swap{
    static void swap(Num n1, Num n2){
        int temp= n1.value;
        n1.value=n2.value;
        n2.value=temp;
    }
    public static void main( String[] args){
        Num a=new Num();
        Num b=new Num();
        a.value=10;
        b.value=20;
        swap(a,b);
        System.out.println(a.value+ " " +b.value);

    }
}

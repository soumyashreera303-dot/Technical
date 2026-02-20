public class InterviewOnSwapping {
    static void change(int x){
        x=100;
    }
    static void increment(int[] arr){
        arr[0]++;
    }
    public static void main(String[] args){
        int x=10;
        change(x);
        System.out.println(x);
        int[] array={5};
        increment(array);
        System.out.println(array[0]);
    }
}

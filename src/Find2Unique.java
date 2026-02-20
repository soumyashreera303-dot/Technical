public class Find2Unique {
    static void twouniqueelements(int[] arr){
        int n1=0,n2=0;
        int xorAll=0;
        for(int i=0;i<arr.length;i++){
            xorAll^=arr[i];
        }
        int rsb=xorAll & -xorAll;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&rsb)!=0){
                n1^=arr[i];
            }
            else{
                n2^=arr[i];
            }
        }
        System.out.println("n1="+n1+", n2=" +n2);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,1};
        twouniqueelements(arr);

    }
}


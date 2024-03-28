public class IterArraycall{
    public static void main(String[] args){
        int[] arr={1,2,4,5,6,7};
        ComArray co= new ComArray();
        System.out.println("Array 3 elements:");
        for(int l:co.arr3){
            System.out.println(l);
        }
        ComArray.main(null);
        System.out.println("Elements are:");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
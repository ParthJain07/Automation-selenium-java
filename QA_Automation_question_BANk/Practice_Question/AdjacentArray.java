public class AdjacentArray {
    
    public static void main(String[] args){
        //Max difference between any adjacent index in array
        int[] arr = {1, 4, 10, 15, 7};
        int maxDiff = Integer.MIN_VALUE;

        for(int i=0; i<arr.length - 1; i++){
            if(arr[i+1] - arr[i] > maxDiff){
                maxDiff = arr[i+1] - arr[i];
            }
        }
        System.out.println("Max Diff " + maxDiff);
    }
}

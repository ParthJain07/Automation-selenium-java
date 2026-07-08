public class sortarraydemo {
    
    public static void main(String[] args){

        int arr[] = {1,3,10,2,5,4};
        //Bubble sort algorithm
        for(int i =0; i< arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }

        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        // TODO Auto-generated method stub
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class SumOfElements {
    
    //Create a Method which accepts Array and returns sum of all the elements in array
    //Print 5 Multiplication without using Multiply operator
    public static void main(String[] args) {
        
        int [] arr = {1, 2,5,4,5};

        int sum = sumArray(arr);
        System.out.println("Sum of all elements in array is: " + sum);

        int res= multipl(5,10); // 50
        System.out.println("result " + res);

        
    }

    private static int multipl(int i, int j) {
        // TODO Auto-generated method stub
        // i has to sum itlsef j times
        int k=1;
        int sum =0;
        while(k <= j){
            sum +=i;
            k++;
        }

        return sum;
    }

    private static int sumArray(int[] arr) {
        
        //throw new UnsupportedOperationException("Unimplemented method 'sumArray'");
        int sum = 0;
        //extract every value of array and sum each value with other
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}

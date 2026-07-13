public class primenum {
    
    public static void main(String[] args){
        int num = 29;

        for( int i=2; i< num/2; i++){
            if( num % i ==0){
                System.out.println(num + " is not a prime number");
                break;
            }
        }
        System.out.println(num + " is a prime number");
    }
}   

public class fanonacci {
    
    public static void main(String[] args){
        int a=0; 
        int b=1;
        int i=1;
        int sum=0;
        while(i < 9){
            sum = a +b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
            i++;
        }
    }
}

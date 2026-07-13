import java.util.*;

public class collectionDemo {
    
    public static void main(String[] args){
        //Print the unique num ftom the list

        int arr[] = {1,4,4,5,6 ,6 ,6};
        ArrayList<Integer> num = new ArrayList<>();

        for(int ele : arr){
            
            if(!num.contains(ele)){
                num.add(ele);
            }
        }

        System.out.println(num);

    } 

}

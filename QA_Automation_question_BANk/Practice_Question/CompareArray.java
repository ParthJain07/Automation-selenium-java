import java.util.*;

public class CompareArray {
    //compare same indexes of 2 different arrays and create another for matching values
    public static void main(String[] args){
        
        int arr1[] = {1, 4,6,8, 7};
        int arr2[] = {1, 2,3,8, 7};

        ArrayList<Integer>al = new ArrayList<Integer>();

        for(int i=0; i<arr2.length; i++){
            if(arr1[i] == arr2[i]){
                al.add(arr1[i]);
            }
        }
        Object[] a = al.toArray();
        
        for( Object ob : a){
            System.out.println(ob);
        }

    }
}

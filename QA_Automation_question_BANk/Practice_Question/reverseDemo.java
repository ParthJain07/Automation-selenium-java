public class reverseDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] arr = str.toCharArray();
        
        int left = 0;
        int right = arr.length - 1;

        // 2. Swap characters until the pointers meet in the middle
        while (right > left) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // 3. Move the pointers
            left++;
            right--;
        }
        System.out.println("Reversed string: " + new String(arr));
    }

    // public static String reverseString(String str) {
    //     StringBuilder reversed = new StringBuilder();
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         reversed.append(str.charAt(i));
    //     }
    //     return reversed.toString();
    // }

}
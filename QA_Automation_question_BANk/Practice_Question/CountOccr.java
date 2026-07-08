public class CountOccr {
    
    public static void main(String[] args){

        int res = countOccurens("ababaaassda", 'a');
        System.out.println(res);
    }

    private static int countOccurens(String word, char str) {
        // TODO Auto-generated method stub
        int count=0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == str){
                count++;
            }
        }
        return count;
    }
}

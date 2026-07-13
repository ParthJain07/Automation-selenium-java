public class InterviewMinNum {
    
    public static void main(String[] args){

        int mat [][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int mn= Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        for (int i =0; i< mat.length; i++){
            for (int j=0; j< mat[i].length; j++){
                if (mat[i][j] < mn){
                    mn = mat[i][j];
                }
                if (mat[i][j] > mx){    
                    mx = mat[i][j];
                }
            }
        }
        System.out.println("Minimum value: " + mn);
        System.out.println("Maximum value: " + mx);
    }
}

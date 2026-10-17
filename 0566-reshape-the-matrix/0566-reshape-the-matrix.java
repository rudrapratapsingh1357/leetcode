class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c){
            return mat;
        }
        
        int[] arr = new int[r*c];
        int ind1 = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                arr[ind1]=mat[i][j];
                ind1++;
            }
        }
        int[][] ans = new int[r][c];
        int ind2 = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ans[i][j] = arr[ind2];
                ind2++;
            }
        }
        return ans;
    }
}
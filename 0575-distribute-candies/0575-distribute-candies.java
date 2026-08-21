class Solution {
    public int distributeCandies(int[] candyType) {
        int total = candyType.length/2;
        int count = 1;
        Arrays.sort(candyType);
        for (int i=0; i<candyType.length-1; i++){
            if (candyType[i]!=candyType[i+1]){
                count ++;
            }
        }
        return Math.min(total,count);
    }
}
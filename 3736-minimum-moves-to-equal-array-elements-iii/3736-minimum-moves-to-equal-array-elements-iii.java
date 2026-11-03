class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int count = 0;
        int ind = 0;
        while(ind<nums.length){
            if(nums[ind]<max){
                nums[ind]+=1;
                count++;
            }
            if(nums[ind]==max){
                ind++;
            }
        }
        return count;
    }
}
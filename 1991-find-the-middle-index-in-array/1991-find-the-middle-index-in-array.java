class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        for(int num: nums){
            sum+=num;
        }
        for(int i=0; i<nums.length; i++){
            int right = sum-left-nums[i];
            if(left==right){
                return i;
            }
            left = left+nums[i];
        }
        return -1;
    }
}
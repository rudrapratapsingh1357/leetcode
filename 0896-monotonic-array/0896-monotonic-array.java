class Solution {
    public boolean isMonotonic(int[] nums) {
        int asc = 0;
        int dsc = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                asc++;
            }
            else if(nums[i]>nums[i+1]){
                dsc++;
            }
        }
        if(asc==0 || dsc==0){
            return true;
        }
        return false;
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int lp=0; lp<nums.length; lp++){
            int sum = 0;
            for (int i=lp; i<nums.length; i++){
                sum+=nums[i];
                if (sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
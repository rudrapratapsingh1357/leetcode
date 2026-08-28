class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int largest = 0;
        for(int num: nums){
            if(num==1){
                count++;
            }
            else{
                count=0;
            }
            if(count>largest){
                largest=count;
            }
        }
        return largest;
    }
}
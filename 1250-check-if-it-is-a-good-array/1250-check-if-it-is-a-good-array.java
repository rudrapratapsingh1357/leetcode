class Solution {
    public boolean isGoodArray(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 1) {
                return true;
            }
            return false;
        }
        int gcd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int a = gcd;
            int b = nums[i];
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            gcd = a;
            if (gcd == 1) {
                return true;
            }
        }
        return false;
    }
}
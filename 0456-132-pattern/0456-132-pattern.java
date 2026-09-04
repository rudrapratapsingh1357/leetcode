class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] stack = new int[n];
        int top = -1;
        int middle = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < middle) {
                return true;
            }
            while (top >= 0 && nums[i] > stack[top]) {
                middle = stack[top--];
            }
            stack[++top] = nums[i];
        }
        return false;
    }
}
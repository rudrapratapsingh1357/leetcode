class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int i = 0;
        int j = 0;
        arr1[i] = nums[0];
        arr2[j] = nums[1];
        for (int k = 2; k < nums.length; k++) {
            if (arr1[i] > arr2[j]) {
                arr1[++i] = nums[k];
            } else {
                arr2[++j] = nums[k];
            }
        }
        for (int l = 0; l <= i; l++) {
            nums[l] = arr1[l];
        }
        for (int b = 0; b <= j; b++) {
            nums[i + 1 + b] = arr2[b];
        }
        return nums;
    }
}
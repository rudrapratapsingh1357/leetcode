class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = (i + 1) * k;
        }
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (arr[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return arr[i];
            }
        }
        return (nums.length + 1) * k;
    }
}

class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] min = new int[n];
        min[0] = nums[0];
        for (int i = 1; i < n; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }
        int width = 0;
        for (int j = 0; j < n; j++) {
            int left = 0;
            int right = j;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (min[mid] <= nums[j]) {
                    width = Math.max(width, j - mid);
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return width;
    }
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int i = 0;
        int j = nums2.length - 1;
        int max = -1;
        while (i < nums1.length && j >= 0) {
            if (nums1[i] < nums2[j]) {
                max = nums2[j];
                j--;
            }
            else if (nums1[i] == nums2[j]) {
                ans[i] = max;
                i++;
                j = nums2.length - 1;
                max = -1;
            }
            else {
                j--;
            }
        }
        return ans;
    }
}
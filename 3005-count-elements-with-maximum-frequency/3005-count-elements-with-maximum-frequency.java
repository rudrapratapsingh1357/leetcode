class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] frequency = new int[101];
        int maxFrequency = 0;
        int totalSum = 0;
        for (int num : nums) {
            frequency[num]++;
            int freq = frequency[num];
            if (freq > maxFrequency) {
                maxFrequency = freq;
                totalSum = freq;
            } else if (freq == maxFrequency) {
                totalSum += freq;
            }
        }
        return totalSum;
    }
}
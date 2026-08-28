class Solution {
    public int maximumProduct(int[] nums) {
        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int largest3 = Integer.MIN_VALUE;
        int smallest1 = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num >= largest1) {
                largest3 = largest2;
                largest2 = largest1;
                largest1 = num;
            } 
            else if (num >= largest2) {
                largest3 = largest2;
                largest2 = num;
            } 
            else if (num >= largest3) {
                largest3 = num;
            }
            if (num <= smallest1) {
                smallest2 = smallest1;
                smallest1 = num;
            } 
            else if (num <= smallest2) {
                smallest2 = num;
            }
        }
        int product1 = largest1 * largest2 * largest3;
        int product2 = smallest1 * smallest2 * largest1;
        return Math.max(product1, product2);
    }
}

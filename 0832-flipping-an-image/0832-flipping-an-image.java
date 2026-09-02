class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;
            while (left <= right) {
                int leftTemp = image[i][left];
                int rightTemp = image[i][right];
                image[i][left] = 1 - rightTemp;
                image[i][right] = 1 - leftTemp;
                left++;
                right--;
            }
        }
        return image;
    }
}
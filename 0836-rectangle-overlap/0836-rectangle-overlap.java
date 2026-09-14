class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = 0, y1 = 1;
        int x2 = 2, y2 = 3;
        boolean Left   = rec1[x2] <= rec2[x1];
        boolean Right  = rec1[x1] >= rec2[x2];
        boolean Below  = rec1[y2] <= rec2[y1];
        boolean Above  = rec1[y1] >= rec2[y2];
        return !(Left || Right || Below || Above);
    }
}
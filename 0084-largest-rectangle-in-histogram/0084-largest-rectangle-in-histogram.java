class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0; i<=heights.length; i++){
            int curr ;
            if(i==heights.length){
                curr = 0;
            }
            else{
                curr = heights[i];
            }
            while(!st.isEmpty() && heights[st.peek()]>curr){
                int h = heights[st.pop()];
                int left;
                if(st.isEmpty()){
                    left = -1;
                }
                else{
                    left = st.peek();
                }
                int w = i-left-1;
                int area = h*w;
                ans = Math.max(area,ans);
            }
            if(i<heights.length){
                st.push(i);
            }
        }
        return ans;
    }
}
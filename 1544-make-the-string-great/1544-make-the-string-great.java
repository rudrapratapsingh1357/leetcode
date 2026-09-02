class Solution {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (ans.length() > 0 && Math.abs(ans.charAt(ans.length() - 1) - c) == 32) {
                ans.deleteCharAt(ans.length() - 1);
            } 
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
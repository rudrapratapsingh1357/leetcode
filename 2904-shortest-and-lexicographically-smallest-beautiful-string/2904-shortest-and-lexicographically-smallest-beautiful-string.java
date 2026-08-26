class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = null;
        int left = 0;
        int ones = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                ones++;
            }
            if (ones == k) {
                while (s.charAt(left) == '0') {
                    left++;
                }
                String candidate = s.substring(left, right + 1);
                if (ans == null) {
                    ans = candidate;
                } 
                else if (candidate.length() < ans.length()) {
                    ans = candidate;
                } 
                else if (candidate.length() == ans.length() 
                        && candidate.compareTo(ans) < 0) {
                    ans = candidate;
                }
                left++;
                ones--;
            }
        }
        if (ans == null) {
            return "";
        }
        return ans;
    }
}
class Solution {
    public String reverseVowels(String s) {
        String vowels = "AEIOUaieou";
        Stack<Character> vowelStack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                vowelStack.push(currentChar);
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                sb.setCharAt(i, vowelStack.pop());
            }
        }
        return sb.toString();
    }
}
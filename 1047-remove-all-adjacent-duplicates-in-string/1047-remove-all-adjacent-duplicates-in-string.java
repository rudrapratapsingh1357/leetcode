class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<>();
        String str = "";
        for(int i=0; i<s.length(); i++){
        if(!st.isEmpty()&& s.charAt(i)==st.peek()){
            st.pop();
        }
        else{
            st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            str =  st.pop() + str;
        }
        return str;
    }
}
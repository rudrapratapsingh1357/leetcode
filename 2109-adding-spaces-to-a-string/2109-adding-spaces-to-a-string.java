class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        char[] result = new char[n+spaces.length];
        int space = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            if(space<spaces.length && i == spaces[space]){
                result[index++]=' ';
                space++;
            }
            result[index++]=s.charAt(i);
        }
        return new String(result);
    }
}
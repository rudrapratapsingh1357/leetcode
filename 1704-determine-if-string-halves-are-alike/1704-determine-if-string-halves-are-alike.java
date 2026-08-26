class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count = 0;
        String vowels = "AEIOUaeiou";
        for(int i=0; i<n/2; i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                count++;
            }
        }

        for(int j=n/2; j<n; j++){
            if(vowels.indexOf(s.charAt(j)) != -1){
                count--;
            }
        }
    return count == 0;
    }
}
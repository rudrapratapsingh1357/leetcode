class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = (coordinates.charAt(0) - 'a');
        int b = (coordinates.charAt(1) - '1');
        boolean c = (a+b)%2==1;
        return c;
    }
}
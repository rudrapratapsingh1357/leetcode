class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<Integer>();
        for(String score:operations){
            if(score.equals("C")){
                scores.pop();
            }
            else if(score.equals("D")){
                scores.push(scores.peek()*2);
            }
            else if(score.equals("+")){
                int t1 = scores.pop();
                int t2 = scores.peek();
                scores.push(t1);
                scores.push(t1+t2);
            }
            else {
                scores.push(Integer.parseInt(score));
            }
        }
        int sum = 0;
        for(int s:scores){
            sum+=s;
        }
        return sum;
    }
}
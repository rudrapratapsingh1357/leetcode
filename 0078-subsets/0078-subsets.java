class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void explore(int[] nums, int idx, List<Integer> temp){
        if(idx==nums.length){
            result.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[idx]);
        explore(nums, idx+1, temp);
        temp.remove(temp.size()-1);
        explore(nums, idx+1, temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        int idx = 0;
        explore(nums, idx, temp);
        return result;
    }
}
class Solution {
    public int minMoves(int[] nums) {
        int max =Integer.MIN_VALUE;
        int count =0;
        for(int num :nums){
            max=(num>max)?num:max;
        }
        for(int num :nums){
            count += max-num;
        }
        return count;
    }
}
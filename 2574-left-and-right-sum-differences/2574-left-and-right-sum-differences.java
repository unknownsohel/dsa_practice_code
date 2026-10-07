class Solution {
    public int[] leftRightDifference(int[] nums) {
        int i=0;
        int j= nums.length -1;
        int suml=0;
        int sumr=0;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] ans = new int[nums.length];
        while(i<nums.length && j>=0){
            suml+=nums[i];
            leftSum[i] =suml;
            sumr+=nums[j];
            rightSum[j]=sumr;
            i++;
            j--;
        }
        for(int k=0;k<nums.length;k++){
            ans[k]=Math.abs(leftSum[k]-rightSum[k]);
        }
        return ans;
        
    }
}
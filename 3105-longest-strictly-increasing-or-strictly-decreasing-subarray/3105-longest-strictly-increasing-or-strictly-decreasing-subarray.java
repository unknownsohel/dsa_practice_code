class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc =1;
        int dec=1;
        int result =1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                dec=1;
                inc++;
            }else if(nums[i+1]<nums[i]){
                dec++;
                inc=1;
            }else{
                inc=1;
                dec=1;
            }
            result =Math.max(result,Math.max(inc, dec));
        }
        return result;
    }
}
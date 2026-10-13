class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        int j=0;
        int k = nums.length-1;
        while(k>=j){
            if(k==j){
                sum+=arr[k];
                break;
            }
            sum+=arr[k];
            sum-=arr[j];
            j++;
            k--;
        }
        return sum;
        
    }
}
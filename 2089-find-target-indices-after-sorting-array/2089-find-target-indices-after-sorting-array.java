class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count =0;
        int less =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                less++;
            }else if(nums[i]==target){
                count++;
            }
        }
        List<Integer> ar = new ArrayList<>();
        for(int j=0;j<count;j++){
            ar.add(less+j);
        }
        return ar;
    }
}
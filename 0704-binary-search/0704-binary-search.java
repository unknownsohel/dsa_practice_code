class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return Bisearch(nums, target, 0, n-1);
    }

    public int Bisearch(int[] nums, int target , int lo, int hi){
        if(lo>hi) return -1;
        int mid = (lo+hi)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return Bisearch(nums, target, lo,mid-1);
        else return Bisearch(nums, target, mid+1,hi);
    }
}
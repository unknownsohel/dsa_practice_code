
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == val) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
            i++;
        }
        return nums.length - count;
    }
}

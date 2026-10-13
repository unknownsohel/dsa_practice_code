class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            long rem;
            if (k == 0) {
                rem = sum;
            } else {
                rem = sum % Math.abs((long) k);
            }
            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
}
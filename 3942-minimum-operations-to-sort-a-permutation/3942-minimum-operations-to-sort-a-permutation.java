class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int pos = 0;
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                pos = i;
            }
            int next = nums[(i + 1) % n];
            if (next != (nums[i] + 1) % n) {
                inc = false;
            }
            if (next != (nums[i] - 1 + n) % n) {
                dec = false;
            }
        }
        int ans = Integer.MAX_VALUE;
        if (inc) {
            ans = Math.min(ans, pos);
            ans = Math.min(ans, n - pos + 2);
        }
        if (dec) {
            ans = Math.min(ans, 1 + (pos + 1) % n);
            ans = Math.min(ans, 1 + n - 1 - pos);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}




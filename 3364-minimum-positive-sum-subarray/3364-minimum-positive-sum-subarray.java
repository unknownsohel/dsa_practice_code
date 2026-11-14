class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        for (int k = l; k <= r; k++) {
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                sum += nums.get(i);
                if (i >= k - 1) {
                    if (sum > 0) {
                        minSum = Math.min(minSum, sum);
                    }
                    sum -= nums.get(i - k + 1);
                }
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
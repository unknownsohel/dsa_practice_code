class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = nums[i];
            int sum = 0;
            while (k > 0) {
                sum += k % 10;
                k /= 10;
            }
            arr[i] = sum;
        }
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = arr[i];  
            a[i][1] = nums[i]; 
            a[i][2] = i;
        }
        Arrays.sort(a, (x, y) -> {
            if (x[0] != y[0]) {
                return Integer.compare(x[0], y[0]);
            }
            return Integer.compare(x[1], y[1]);
        });
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || a[i][2] == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = a[j][2];
                cycleSize++;
            }
            swaps += cycleSize - 1;
        }
        return swaps;
    }
}
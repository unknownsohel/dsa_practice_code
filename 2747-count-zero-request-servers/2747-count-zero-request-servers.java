class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
        int[][] sortedQueries = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, (a, b) -> Integer.compare(a[0], b[0]));
        int[] ans = new int[queries.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        for (int[] query : sortedQueries) {
            int q = query[0];
            int index = query[1];
            int start = q - x;
            while (right < logs.length && logs[right][1] <= q) {
                int server = logs[right][0];
                map.put(server, map.getOrDefault(server, 0) + 1);
                right++;
            }
            while (left < right && logs[left][1] < start) {
                int server = logs[left][0];
                int count = map.get(server) - 1;
                if (count == 0) {
                    map.remove(server);
                } else {
                    map.put(server, count);
                }
                left++;
            }
            ans[index] = n - map.size();
        }
        return ans;
    }
}
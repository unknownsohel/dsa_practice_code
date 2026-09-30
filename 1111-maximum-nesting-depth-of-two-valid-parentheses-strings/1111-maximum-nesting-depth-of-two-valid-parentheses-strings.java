class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        int count = 0;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                count++;
                ans[i] = count % 2;
            } 
            else {
                ans[i] = count % 2;
                count--;
            }
        }

        return ans;
    }
}
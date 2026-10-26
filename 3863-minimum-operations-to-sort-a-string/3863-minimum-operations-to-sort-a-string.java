class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char min = 'z';
        char max = 'a';
        boolean sorted = true;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);

            if (i > 0 && s.charAt(i - 1) > c) {
                sorted = false;
            }
        }

        if (sorted) return 0;
        if (n == 2) return -1;

        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

        if (s.charAt(0) == max && s.charAt(n - 1) == min
            && s.indexOf(min) == n - 1
            && s.lastIndexOf(max) == 0) {
            return 3;
        }

        return 2;
    }
}
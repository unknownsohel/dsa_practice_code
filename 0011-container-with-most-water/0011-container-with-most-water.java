class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int amount = 0;
        while (i < j) {
            int length = Math.min(height[i], height[j]);
            int breadth = j - i;
            int area = length * breadth;
            amount = Math.max(amount, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return amount;
    }
}
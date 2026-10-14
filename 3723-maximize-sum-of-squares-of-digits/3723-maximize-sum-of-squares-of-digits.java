class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum == 0 || sum > num * 9) {
            return "";
        }
        StringBuilder str = new StringBuilder();
        while (num > 0) {
            if (sum >= 9) {
                str.append('9');
                sum -= 9;
            } else {
                str.append(sum);
                sum = 0;
            }
            num--;
        }
        return str.toString();
    }
}

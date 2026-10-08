class Solution {
    public String removeOuterParentheses(String s) {
        String str = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) {
                    str += '(';
                }
                count++;
            } 
            else {
                count--;

                if (count > 0) {
                    str += ')';
                }
            }
        }
        return str;
    }
}
class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i == s.length()) return 0;
        int sign = 1;
        if(s.charAt(i) == '-') {
            sign = -1;
            i++;
        }else if(s.charAt(i) == '+') {
            i++;
        }
        int num=0;
        while(i<s.length()){
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }
            int digit = s.charAt(i) - '0';
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        return num*sign;

    }
}
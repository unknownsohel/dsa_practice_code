class Solution {
    public String digitSum(String s, int k) {
        while(k<s.length()){
            int i=0;
            int sum=0;
            StringBuilder sb = new StringBuilder();
            while(i<s.length()){
                sum+=s.charAt(i)-'0';
                if((i + 1) % k == 0 || i == s.length() - 1){
                    sb.append(Integer.toString(sum));
                    sum=0;
                }
                i++;
            }
            s=sb.toString();
        }
        return s;
    }
}
class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        int t =0;
        long sum =0;
        while(n>0){
            int temp = n%10;
            if(temp!=0){
                x+=(temp*(long)Math.pow(10,t));
                t++;
                sum+=temp;
            }
            n/=10;
        }
        return x*sum;
    }
}
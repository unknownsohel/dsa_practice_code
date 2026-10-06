class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)==')' && stack.isEmpty()){
                count++;
            }
            if(s.charAt(i)==')' && !stack.isEmpty()){
                stack.pop();
            }
            
        }
        while(!stack.isEmpty()){
            count++;
            stack.pop();
        }
        return count;
    }
}
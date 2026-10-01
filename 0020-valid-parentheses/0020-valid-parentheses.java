class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                int top = stack.pop();
                if(top=='(' && s.charAt(i)!=')'){
                    return false;
                }
                if(top=='[' && s.charAt(i)!=']' ){
                    return false;
                }
                if(top=='{' && s.charAt(i)!='}'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
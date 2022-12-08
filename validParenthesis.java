class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1){
            return false;
        }
        Stack<Character> stk = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')'&&!stk.empty() && stk.peek() == '('){
                stk.pop();
            }else if(s.charAt(i) == '}' && !stk.empty() && stk.peek() == '{')           {
                    stk.pop();
            }
            else if(s.charAt(i) == ']'&&!stk.empty() && stk.peek() == '['){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        return stk.empty();
    }
}

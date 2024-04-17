class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()>0){
                    if(ch==')' && st.peek()=='('){
                        st.pop();
                    }
                    else if(ch=='}' && st.peek()=='{'){
                        st.pop();
                    }
                    else if( ch==']' && st.peek()=='['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        return true;
    }
}
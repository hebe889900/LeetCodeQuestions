c class Solution {
    public boolean isValid(String s) {
        Stack<Character> p = new Stack<Character>();
        
        for (int i =0;i<s.length();++i){
            
            Character c = s.charAt(i);
            if (c=='(' || c=='{' ||c=='['){
                p.push(c);
            }
            else{
                
                if (p.empty()) return false;
                
                char top = p.pop();
                if (c==')' && top !='(') return false;
                else if (c=='}' && top != '{') return false;
                else if (c==']' && top != '[') return false;
            }
            
            
        }
        
        if(!p.empty())
            return false;
        
        return true;
        
    }
}

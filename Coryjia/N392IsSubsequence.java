public class N392IsSubsequece{
    public boolean isSubSequence(String s, String t){
      if(s.length() == 0 ) return true;
      if(s.length() > t.length()) return false;
      
      Stack<Character> stack = new Stack<>();
      
      for(int i = s.length() - 1; i >= 0; i--){
          stack.add(s.charAt(i));
      }
      
      for(char c : t.toCharArray()){
          if(c == stack.peek())  stack.pop();
          
          if(stack.isEmpty()) return true;
      }
      return false;
    }
}

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<String>();
        
        String simple = "";
        
        String[] parts = path.split("/");
        
        for (int i=0;i<parts.length;++i)
        {
            if (parts[i].equals("."));
            else if (parts[i].equals("..") && !st.empty()){
                st.pop();
            }
            else if (parts[i].equals(""));
            else{
                if (!parts[i].equals("..")) st.push(parts[i]);
            }
        }
        
        if (st.empty()) return "/"+simple;
        
        while (!st.empty()){
            simple = "/"+ st.pop() + simple;
        }
        
        return simple;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        
        List<Integer> l = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        
        if (root == null)
            return true;
            
        TreeNode curr = root;

        
        while (curr != null || !st.empty()){
        
            if (curr != null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                curr = st.peek();
                st.pop();
                l.add(curr.val);
                curr = curr.right;
            }
        
        }
        
        for(int i = 1; i < l.size(); i++)
        {
            if (l.get(i-1).compareTo(l.get(i)) >= 0)
                return false;
        }
        
      
        return true;
        
    }
}




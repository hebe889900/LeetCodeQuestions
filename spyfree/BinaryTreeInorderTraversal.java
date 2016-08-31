tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> l = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        
        if (root == null)
            return l;
            
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
        
        return l;
    }
}

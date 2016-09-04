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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        if(root == null)
            return list;
        s1.push(root);
        while(!s1.empty()){
            root = s1.pop();
            s2.push(root);
            if(root.left != null) s1.push(root.left);
            if(root.right != null) s1.push(root.right);
        }
        while(!s2.empty()){
            list.add(s2.pop().val);
        }
        return list;
    }
}

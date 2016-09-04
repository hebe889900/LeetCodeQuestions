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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        while(!s.empty() || root != null){
            while(root != null){
                s.push(root);
                list.add(root.val);
                root = root.left;
            }
            root = s.pop().right;
        }
        return list;
    }
}

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
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return true;
        Stack<TreeNode> s = new Stack<>();
        while(!s.empty() || root != null){
            while(root != null){
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            list.add(root.val);
            root = root.right;
        }
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i+1))
                return false;
        }
        return true;
    }
}

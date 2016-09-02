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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        
        List<List<Integer>> ret = new ArrayList();;
        if (root == null) return ret;
        Queue<TreeNode> temp  = new LinkedList<TreeNode>();;
        
        List<Integer> slevel = new ArrayList(); ;
        
        TreeNode curr = root;
        temp.add(curr);
        
        boolean flag = false;
        
        int i = temp.size();
        
        
        while (!temp.isEmpty()){
            if(i==0){
                if (flag){
                    Collections.reverse(slevel);
                }
                
                flag = !flag;
                    
                ret.add(slevel);
                
                i = temp.size();
                slevel = new ArrayList();
            }
            
            curr = temp.poll();
            slevel.add(curr.val);
            
            --i;
            
            if (curr.left != null ) temp.add(curr.left);
            if (curr.right != null ) temp.add(curr.right);
            
        }
        
        if (flag) {
            Collections.reverse(slevel);
        }
        ret.add(slevel);

        return ret;
        
        
    }
}

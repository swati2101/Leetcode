/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
           return new ArrayList<Integer>(); 
        }
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        //res.add(root.val);
        while (q.size()>0){
            int max=Integer.MIN_VALUE;
            int size=q.size();
            for(int i=0;i<size;i++){
                System.out.println("MAxx"+max);
                
                TreeNode temp = q.remove();
                max=Math.max(max,temp.val);
                System.out.println("Temp"+temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                    System.out.println("From left"+temp.left.val);
                    //max=Math.max(max,temp.left.val);
                    //System.out.println("Max from left"+max);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    System.out.println("From right"+temp.right.val);
                    //max=Math.max(max,temp.right.val);
                    //System.out.println("Max from right"+max);
                }
                
            } 
            System.out.println(max);
            res.add(max);
            
            
        }
    return res;
    }
}
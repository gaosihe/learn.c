import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param root TreeNode类 
     * @return bool布尔型
     */
    public boolean isSymmetric (TreeNode root) {
        // write code here
        if(root==null) return true;
        return heler(root.left,root.right);
    }
     public boolean heler(TreeNode left,TreeNode right){
         if(left==null&&right==null) return true;
         if(left==null||right==null) return false;
         if(left.val!=right.val)return false;
         else{
             boolean ran1=heler(left.left,right.right);
         if(!ran1) return false;
             boolean ran2=heler(left.right,right.left);
         if(!ran2) return false;
             return true;
         }
         
     }
}
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0||in.length!=pre.length){
            return null;
        }
        return reConstructBinaryTreeCore(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode reConstructBinaryTreeCore(int[] pre,int pre_start,int pre_end,int[] in,int in_start,int in_end){
        if(pre_start>pre_end||in_start>in_end){
            return null;
        }
        TreeNode node = new TreeNode(pre[pre_start]);
        int i=in_start;
        for(;i<=in_end;i++){
            if(in[i]==pre[pre_start]){
                node.left = reConstructBinaryTreeCore(pre,pre_start+1,pre_start+i-in_start,in,in_start,in_start+i-1);
                node.right = reConstructBinaryTreeCore(pre,pre_start+i-in_start+1,pre_end,in,1+i,in_end);
                break;
            }
        }
        return node;
    }
}
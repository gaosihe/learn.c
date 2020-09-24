package Test.Test6;

import java.util.ArrayList;
import java.util.Stack;

public class TreeNotdigui0924 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
    public ArrayList<Integer> preorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack <TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right!=null){
                stack.push(node.right);
            }
            if (node.left!=null){
                stack.push(node.left);
            }
        }
        return list;
    }
}

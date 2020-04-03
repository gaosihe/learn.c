package Test0331;

import org.omg.CORBA.TRANSACTION_MODE;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InterviewTree0402 {//判断是否为完全二叉树
    public boolean isCompleteTree(TreeNode root){
        if (root == null){
            return true;
        }
        boolean isSecondStep = false;
        //层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            //针对当前结点进行访问
            //TODO
            if (!isSecondStep){
                //这是第一阶段
                if (cur.left!= null&&cur.right!=null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }else if (cur.left == null&&cur.right != null){
                    return false;
                }else if (cur.left !=null &&cur.right == null){
                    isSecondStep = true;
                    queue.offer(cur.left);
                }else{
                    //左右子树都空,也切换到第二阶段
                    isSecondStep = true;
                }
            }
            else {
                //这是第二阶段
                //要求第二阶段中任何一个结点都必须没有子树
                if (cur.left!= null||cur.right !=null){
                    return false;
                }
            }
        }
        //整个树都遍历玩都没找到反例;
        return true;

    }
    //result相当一个二维数组
    //result 0 号元素对应第0层节点...
    static List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root){
        //树的每一层节点放到单独的List中
        if (root == null){
            return result;
        }
        //helper方法辅助递归 层数从0开始算
        helper(root,0);

        return result;
    }

    private void helper(TreeNode root, int level) {
        if (level == result.size()){
            result.add(new ArrayList<>());
        }
        //把当前结点添加到result中
        result.get(level).add(root.val);
        if (root.left!=null){
            helper(root.left,level+1);
        }
        if (root.right!=null){
            helper(root.right,level+1);
        }
    }

    public static void main(String[] args) {

    }
}

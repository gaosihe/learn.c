package Test0331;

import java.util.LinkedList;
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
}

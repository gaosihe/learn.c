package Test0331;


import java.util.ArrayList;
import java.util.List;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class InterviewTree0331 {//先序遍历二叉树
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root== null) {
            //空树返回一个空的list,不是null
            return result;
        }
        result.add(root.val);
        //访问根节点,把元素加到List中
        //递归遍历左右子树,把遍历结果加到list中
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }

    public List<Integer> inorderTraversal(TreeNode root){//中序遍历
        List<Integer> result = new ArrayList<>();
        if (root== null) {
            //空树返回一个空的list,不是null
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        //访问根节点,把元素加到List中
        //递归遍历左右子树,把遍历结果加到list中
        result.addAll(inorderTraversal(root.right));
        return result;
    }

    public boolean isSameTree(TreeNode p,TreeNode q){//判断两个树是否相同
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }

    public boolean isSubtree(TreeNode s ,TreeNode t){//判断一棵树是不是另一颗树的子树
        //本质就是判断一棵树与另一棵树的子树是否相等
        if(s== null &&t== null){
            return true;
        }
        if (s== null || t==null){
            return false;
        }
        boolean ret = false;
        if (s.val == t.val){
            //如果根节点相同,进一步判定s和t是不是相同的树
            ret = isSameTree(s,t);
        }
//        if (!ret){
//            //s和t不相等,递归看s.left是否包含t
//            ret = isSubtree(s.left,t);
//        }
//        if (!ret){
//            //s.left也不包含看,再看是s.right是否包含t
//            ret = isSameTree(s.right,t);
//
//        }
//        return ret;
        return ret ||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public int maxDepth(TreeNode root){//求二叉树的深度
        if (root == null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1+(leftDepth>rightDepth?leftDepth:rightDepth);
    }
    public boolean isBalanced(TreeNode root){//判断是否平衡二叉树,左右子树高度差不超过1
        if (root == null){
            return true;
        }
        if (root.left==null&&root.right==null){
            return true;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (leftDepth - rightDepth > 1||leftDepth - rightDepth < 1){
            return false;
        }
        return  isBalanced(root.right)&&isBalanced(root.left);
    }
    public boolean isSymetric(TreeNode root){//判断二叉树是否镜像对称
        if (root == null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 ==null){
            return true;
        }
        if(t1 == null|| t2 == null){
            return false;
        }
        if(t1.val!=t2.val){
            return false;
        }
        return isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
    }
}









package Test0331;

public class InterviewTree0404 {//二叉树公共祖先
    //lca表示最近公共祖先
    private TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root == null){
            return null;
        }
        //一旦找到了就把lca放到这个变量中
        findNode(root,p,q);
        return lca;
    }

    //从root出发能不能找到pq找到一个就返回true
    private boolean findNode(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return false;
        }
        //递归按照后序遍历的方式来找
        int left = findNode(root.left,p,q)?1:0;
        int right = findNode(root.right,p,q)?1:0;
        int mid = (root == p||root == q)?1:0;
        if (left + right + mid==2){
            lca = root;
        }
        return (left +right + mid)>0;
    }
}

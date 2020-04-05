package Test0331;

import Test0201.Test0203;

import java.util.Stack;

public class InterviewDemo0405 {

    public static TreeNode build() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left= b;
        a.right= c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }
    public static void preOrderByLoop(TreeNode root){
        //非递归的方式进行先序遍历
        //需要一个栈进行辅助
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode top = stack.pop();
            //访问这个节点
            System.out.print(top.val + " ");
            //把左子树和右子树分别入栈
            if (top.right != null){
                stack.push(top.right);
            }
            if (top.left != null){
                stack.push(top.left);
            }
        }
    }

    public static void inOrderByLoop(TreeNode root){
        //非递归的方式进行中序遍历
        if (root == null){
            return;
        }
        //准备一个栈起辅助效果
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (true){
            //1.循环往左找,把路径上遇到的节点都入栈
            while (cur!= null){
                stack.push(cur);
                cur = cur.left;
            }
            //2.如果当前栈为空,就结束
            if (stack.isEmpty()){
                break;
            }
            //3.取栈顶元素并访问
            TreeNode top = stack.pop();
            System.out.print(top.val +" ");
            //从右子树继续刚才的过程
            cur = top.right;
        }
    }

    public static void postOrder(TreeNode root){
        //非递归的方式进行后序遍历
        if( root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur=root;
        //prev记录当前已经访问过的的节点钟得最后一个
        TreeNode prev= null;
        while (true){
            while (cur !=null){
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()){
                break;
            }
            //拿出栈顶的值看能不能访问
            TreeNode top = stack.peek();
            if(top.right == null||prev == top.right){
                //说明这个栈顶元素可以访问
                System.out.print(top.val+ " ");
                stack.pop();
                prev = top;
                //prev记录当前已经访问过的的节点中得最后一个
            }else{
                cur=top.right;
            }
        }

    }

    public static void main(String[] args) {
        TreeNode root = build();
        postOrder(root);
    }
}















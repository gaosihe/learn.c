package Test0331;

import java.util.Scanner;

public class BulidTreeDemo0403 {
    static class TreeNode{
        public char val;
        TreeNode left;
        TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            //line这个字符串对应一组如"abc##de#g##f###"的输入数据
            String line = scanner.next();
            TreeNode root = build(line);
            inOrder(root);
            System.out.println();
            //要严格注意输出格式
        }
    }

    private static void inOrder(TreeNode root) {
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+ " ");
        inOrder(root.right);
    }

    private static int index = 0;
    private static TreeNode build(String line) {
        //为了在后面的递归创建过程中知道访问到line那个元素了
        //使用一个专门的变量记录一下
        index= 0;
        return createTreePreOrder(line);
    }

    private static TreeNode createTreePreOrder(String line) {
        //获取到当前处理到那个结点
        char cur = line.charAt(index);
        if(cur == '#'){
            return null;
        }
        //当前字符不是#就创建一个结点
        TreeNode root = new TreeNode(cur);
        index++;//准备处理下一个节点,下一个就是当前root左子树先序遍历结果
        root.left=createTreePreOrder(line);
        index++;
        root.right=createTreePreOrder(line);
        return root;
    }
}

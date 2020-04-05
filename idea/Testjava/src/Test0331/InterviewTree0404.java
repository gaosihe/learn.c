package Test0331;

public class InterviewTree0404 {//二叉树公共祖先
    //lca表示最近公共祖先
    private TreeNode lca = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        //一旦找到了就把lca放到这个变量中
        findNode(root, p, q);
        return lca;
    }

    //从root出发能不能找到pq找到一个就返回true
    private boolean findNode(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        //递归按照后序遍历的方式来找
        int left = findNode(root.left, p, q) ? 1 : 0;
        int right = findNode(root.right, p, q) ? 1 : 0;
        int mid = (root == p || root == q) ? 1 : 0;
        if (left + right + mid == 2) {
            lca = root;
        }
        return (left + right + mid) > 0;
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        //基于递归的方式来完成双向链表的构建.为保证有序性,需要中序遍历
        //二叉搜索树的中序遍历结果是有序
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
            //当前这个结点没有子树
        }
        //左子树的链表连接 根节点 连接 右子树
        //1.先递归处理左子树
        //left就是左子树这个链表的根节点
        TreeNode left = Convert(pRootOfTree.left);
        //2.需要找到左子树链表的尾节点
        TreeNode leftTail = left;
        while (left != null && leftTail.right != null) {
            leftTail = leftTail.right;
        }
        //循环结束之后,leftTail就指向了链表的尾部
        //3.把左子树和当前节点连在一起
        if (left != null) {
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }
        //4.递归转换右子树,变成双向链表
        TreeNode right = Convert(pRootOfTree.right);
        //5.把当前节点和右子树连在一起
        if (right != null) {
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }
        //6.最终返回新的链表的头结点
        //如果left为空,头结点就是pRootOfTree
        //如果left非空,头结点就是left
        return left == null ? pRootOfTree : left;
    }

    //根据先序遍历和中序遍历结果构建出二叉树
    private int index;//当前访问到先序遍历的第几个元素了

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return buildTreeHelper(preorder, inorder, 0, inorder.length);
    }

    //[left,right)这个区间就表示当前preorder[index]这个节点对应的子树的中序遍历结果
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int left, int right) {
        if (left >= right) {
            //中序遍历为空,这个树就是空树
            return null;
        }
        if (index >= preorder.length) {
            return null;
        }
        //根据当前根节点的值创建出根节点
        TreeNode root = new TreeNode(preorder[index]);
        index++;//节点创建完毕就index++准备处理下一个节点
        //根据该节点在中序遍历结果钟得位置,把inorder数组划分成两个部分
        int pos = find(inorder, left, right, root.val);
        //[left,pos)表示当前root左子树的中序遍历结果;
        //[pos + 1,right)表示当前root右子树 的中序遍历结果.
        root.left = buildTreeHelper(preorder, inorder, left, pos);
        root.right = buildTreeHelper(preorder, inorder, pos + 1, right);
        return root;
    }

    private int find(int[] inorder, int left, int right, int toFind) {
        for (int i = left; i < right; i++) {
            if (inorder[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //使用sb表示最终二叉树的字符串结果
    //递归过程中得到的局部结构都往sb中追加即可
    private StringBuilder sb = new StringBuilder();

    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        //借助helper方法递归进行先序遍历
        helper(t);
        //递归后将前面和后面的括号删掉
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private void helper(TreeNode t) {
        if (t == null) {
            return;
        }
        //访问根节点将字符串追加到sb中即可
        sb.append("(");
        sb.append(t.val);
        helper(t.left);
        if (t.left == null && t.right != null){
            sb.append("()");
        }
        helper(t.right);
        sb.append(")");
    }
}

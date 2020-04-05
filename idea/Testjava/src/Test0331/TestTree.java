package Test0331;

class Node{
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
public class TestTree {
    public static void main(String[] args) {
        Node root = build();
        System.out.println("先序遍历:");
        preOrder(root);
        System.out.println();

        System.out.println("中序遍历:");
        inOrder(root);
        System.out.println();

        System.out.println("后序遍历:");
        postOrder(root);
        System.out.println();

    }
    public static Node build(){
        //手动把一棵树构造出来
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        e.left=g;
        g.right=h;
        c.right=f;

        return a;
    }
    public static void preOrder(Node root){//先序遍历
        if(root==null){
            return;
        }
        System.out.print(root.val+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){//中序遍历

        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+ " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){//后序遍历

        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+ " ");

    }
    //写一个方法,求二叉树中的结点个数
    public static int size(Node root){
        if (root==null){
            return 0;
        }
        //访问根节点,计数器加一
        //体会递归拆分问题的过程
        //整个数结点个数= 根节点个数+左子树+右子树
        return 1+size(root.left)+size(root.right);
    }
    //求二叉树的叶子结点个数
    //根叶子节点个数+叶子左子树+叶子右子树
    public static int leafSize(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null&&root.right==null){
            return 1;
        }
        return leafSize(root.left)+leafSize(root.right);
    }
    //求二叉树k层结点个数
    //如果k<1只能是空树.return 0;
    //k=1 返回1;
    //k层结点的个数= 左子树的k-1层结点个数+右子树的 k-1层结点个数
    public static  int kLevelSize(Node root,int k){
        if(k < 1||root==null){
            return  0;
        }
        if (k==1){
            return  1;
        }
        return kLevelSize(root.left,k-1)+kLevelSize(root.right,k-1);
    }
    //在二叉树中查找指定元素
    //核心思路还是遍历
    Node find(Node root,char toFind){
        if (root == null){
            return null;
        }
        if (root.val==toFind){
            return root;
        }
        Node result = find(root.left,toFind);
        if (result != null){
            return result;
        }
        return find(root.right,toFind);
    }
}







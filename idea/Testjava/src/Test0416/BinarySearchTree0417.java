package Test0416;

public class BinarySearchTree0417 {//二叉搜索树
    public static class Node{
        int key;
        //int value;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }
    //根节点root
    private Node root = null;

    public Node find(int key){
        //查找key是否存在
        Node cur = root;
        while (cur!= null){
            if (key<cur.key){
                //就去左子树中找
                cur = cur.left;
            }else if (key>cur.key){
                cur= cur .right;
            }else {
                return cur;
            }
        }
        return null;
    }

    //二叉搜索树不允许存在相同的值
    //相同就返回失败false
    public boolean insert(int key){//插入值
        //和查找类似需要找到合适的位置
        if (root == null){
            root = new Node(key);
            return true;
        }
        Node cur =root;
        Node parent = null;//parent始终指向cur的父节点
        while (cur!=null){
            if (key<cur.key){
                parent = cur;
                cur = cur.left;
            }else if (key>cur.key){
                parent = cur;
                cur=cur.right;
            }else {
                return false;
            }
        }
        //循环结束时,cur就指向null,就判定插左子树还是右子树
        if (key<parent.key){
            parent.left = new Node(key);
        }else {
            parent .right = new Node(key);
        }
        return true;
    }
    //删除节点,成功true失败false
    //key存在就成功
    public boolean remove(int key){
        //找节点位置再判断怎末删除
        Node cur = root;
        Node parent = null;
        while (cur!=null){
            if (key<cur.key){
                parent = cur;
                cur = cur.left;
            }else if (key>cur.key){
                parent = cur;
                cur=cur.right;
            }else {
                //找到要删除元素
                //在这个方法里判断删除的情况
                removeNode(parent,cur);
                return true;
            }
        }
        return false;
    }

    private void removeNode(Node parent, Node cur) {
        if (cur.left == null){
            //1.左子树是空
            if (cur == root){
                //1.1如果为root
                root=cur.right;
            }else if(cur== parent.left){
                //如果cur是父节点的左子树
                parent.left=cur.right;
            }else {
                //为父节点的右子树
                parent.right=cur.right;
            }
        }else if (cur.right == null){
            //要删除的元素没有右子树
            if (cur == root){
                root = cur.left;
            }else if (cur == parent.left){
                //如果cur是父节点的左子树
                parent.left = cur.left;
            }else {
                //为父节点的右子树
                parent.right=cur.left;
            }
        }else {//当前要删除结点有两个子树
            //先找右子树的最小元素,再把找到的值赋给待删除结点
            Node goatParent = cur;
            Node  scapeGoat = cur.right;
            while (scapeGoat.left!=null){
                goatParent = scapeGoat.left;
                scapeGoat = scapeGoat.left;
            }
            //循环结束时 scapeGoat指向了右子树的最小值
            cur.key = scapeGoat.key;
            if (scapeGoat==goatParent.left){
                goatParent.left = scapeGoat.right;
            }else {
                goatParent.right =scapeGoat.right;
            }
        }
    }
}










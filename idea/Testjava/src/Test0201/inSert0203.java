package Test0201;

public class inSert0203 {
    private int n;//实际储存的元素个数
    private Object table[];//定义一个数组,用来建立顺序表
    public inSert0203(int size){
        table=new Object[size];
        //实际存储的元素个数为0
        this.n=0;
    }
    public inSert0203(){
        this(64);
    }
    //往顺序表中添加元素
    public boolean addElement(int index,Object obj) {
        //判断传入的元素为null,则结束当前方法
        if(obj==null)
            return false;
        //判断当前数组中的元素是否已经存满
        //将table数组中的赋值给一个临时数组
        if(n==table.length){
            Object temp[]=this.table;
            //给table数组扩容
            table=new Object[temp.length*2];
            //将temp中的值存储到table数组中
            for (int i=0;i<temp.length;i++){
                table[i]=temp[i];
            }
        }
        //如果下标小于0,则下标等于0
        if (index<0){
            index=0;
        }
        //如果下标大于实际存储数组个数
        //则让他当前实际存储元素个数的下标
        if (index>table.length){
            index=n;
        }
        //将index之后的元素往后移
        for (int i=index;i<n;i++){
            table[i]=table[i+1];
        }
        //将obj元素插入到数组中去
        table[index]=obj;
        //实际存储个数加1
        this.n++;
        return true;
    }
    //删除顺序表元素
    public boolean Remove(int index){
        //判断下标是否合法,否则退出方法
        if (index<0||index>this.n){
            System.out.println("下标不合理,删除失败");
            return false;
        }
        //把要删除的元素往前移
        for (int i=index;i<this.n-1;i++){
            this.table[i]=this.table[i+1];
        }
        //移完之后进行删除操作
        this.table[this.n-1]=null;
        //删除一个元素后数组长度减1
        this.n--;
        return true;
    }
    //对顺序表进行修改
    public boolean amend(int index,Object obj){
        //判断下标是否合法,否则退出方法
        if (index<0||index>this.n){
            System.out.println("下标不合理,删除失败");
            return false;
        }
        table[index]=obj;
        return true;
    }

    public static void main(String[] args) {
        inSert0203 in=new inSert0203();
        //插入元素
        in.addElement(0,"我");
        in.addElement(1,"爱");
        in.addElement(2,"中");
        in.addElement(3,"国");
        in.addElement(4,"武");
        in.addElement(5,"汉");
        in.addElement(6,"加");
        in.addElement(7,"油");
        //删除元素
        in.Remove(0);
        //修改元素
        in.amend(0,52);
        //遍历输出
        for (int i=0;i<in.n;i++){
            System.out.println(in.table[i]);
        }
    }
}

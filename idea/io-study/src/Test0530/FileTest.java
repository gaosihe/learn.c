package Test0530;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
    @Test
    public void t1(){
        //文件的绝对路径是全路径,相对路径: ./(当前目录).../(上一级路径)
        File file = new File("F:\\learn.c\\idea\\io-study\\data\\随便.txt");
        System.out.println(file.exists());
        File f2 = new File("../data/随便.txt");
        System.out.println(f2.exists());
        //怎么查看当前Java代码的路径
        File f3 = new File(".");
        System.out.println(f3.getAbsolutePath());
        File f4 = new File("data/随便.txt");//file类写相对路径不建议在真实的代码中使用
        System.out.println(f4.exists());//文件是否存在
        System.out.println(f4.getPath());//获取路径
        System.out.println(f4.lastModified());//上次修改时间

    }
    @Test
    public void t2(){
        File f5 = new File("F:\\learn.c\\idea\\io-study");
        File[] children = f5.listFiles();
        for (File child : children){
            System.out.println(child.getName());
        }
    }

    public static List<File> list(File f){
        List<File> files = new ArrayList<>();
        if (f.isFile()){
            files.add(f);
        }else{
            //下一级子文件,子文件夹
            File[] children = f.listFiles();
            for (File child : children){
                List<File> subs = list(child);
                files.addAll(subs);
            }
        }
        return files;
    }

    @Test
    public void t3(){
        File f5 = new File("F:\\learn.c\\idea\\io-study");
        List<File> children = list(f5);
        for (File child : children){
            System.out.println(child.getName());
        }
    }
}

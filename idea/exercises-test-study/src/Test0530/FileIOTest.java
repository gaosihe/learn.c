package Test0530;

import org.junit.Test;

import java.io.*;

public class FileIOTest {

    @Test
    public void t1() throws IOException {//字节流
        FileInputStream fis = null;
        try {
            //第一种方式,使用FileInputStream+绝对路径,
            //第二种方式,使用ClassLoader+相对路径(推荐)
            fis = new FileInputStream(new File("F:\\learn.c\\idea\\io-study\\data\\随便.txt"));
            //fis = this.getClass().getClassLoader().getResourceAsStream("F:\\learn.c\\idea\\io-study\\data\\随便.txt");
            //abcdefg. 读取操作,从当前位置偏移多少位(read,new String中的第二个参数),读取多长(第三个参数)
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes))!=-1){
                String s = new String(bytes,0,len);
                System.out.println(s);
            }
        } finally {
            if (fis !=null)
                fis.close();
        }
    }

    @Test
    public void t2() throws IOException {//字符流
        FileReader reader = new FileReader("F:\\learn.c\\idea\\io-study\\data\\随便.txt");
        char[] chars = new char[1024];
        int len;
        while ((len = reader.read(chars))!=-1){
            String s = new String(chars,0,len);
            System.out.println(s);
        }
    }
    @Test
    public void t3() throws IOException {//字节转换字符流,缓冲流
        FileInputStream fis = new FileInputStream("F:\\learn.c\\idea\\io-study\\data\\随便.txt");
        //字节字符转换流,指定编码格式,Java编译的编码如果和目标文件的编码格式不一样,就会出现乱码
        InputStreamReader isr = new InputStreamReader(fis,"GBK");
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine())!= null){
            System.out.println(line);
        }
    }
    @Test
    public void t4() throws IOException {//
        FileInputStream fis = new FileInputStream("F:\\learn.c\\idea\\io-study\\data\\随便.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes))!=-1){
            String s = new String(bytes,0,len);
            System.out.println(s);
        }
    }
    @Test
    public void t5() throws FileNotFoundException {//
        //覆盖的方式
        FileOutputStream fos = new FileOutputStream("F:\\learn.c\\idea\\io-study\\data\\随便.txt");
        //追加到文件末尾
//        FileOutputStream fos = new FileOutputStream("F:\\learn.c\\idea\\io-study\\data\\随便.txt",true);
        PrintWriter pw = new PrintWriter(fos,true);//自动刷新缓冲区
        pw.println("追加1");
        pw.println("追加2");
        pw.println("追加3");
//        pw.flush();//手动刷新缓冲区
    }
    @Test
    public void t6() throws IOException {//缓冲输出字符流
        //覆盖的方式
        FileOutputStream fos = new FileOutputStream("F:\\learn.c\\idea\\io-study\\data\\随便.txt");
        //追加到文件末尾
//        FileOutputStream fos = new FileOutputStream("F:\\learn.c\\idea\\io-study\\data\\随便.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("追加1");
        bw.newLine();
        bw.write("追加2");
        bw.newLine();
        bw.write("追加3");
        bw.newLine();
        bw.flush();
    }
}

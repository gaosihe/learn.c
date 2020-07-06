package newthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableCreate {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> c =new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("call");
                return "ok";
            }
        };
        FutureTask task = new FutureTask(c);
        Thread t= new Thread(task);
        t.start();
        System.out.println(task.get());//future.get()和jojn表现结果类似,只是提供了一个返回值
        System.out.println("main");

    }
}

package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class FileReadWrite {
    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Lock readLock = lock.readLock();
        Lock writeLock = lock.writeLock();
        //20 个线程对同一个文件读操作
        for (int i = 0;i<20;i++){
            new Thread(()->{
                readLock.lock();
                try {
                    //文件读取
                } finally {
                    readLock.unlock();
                }
            }).start();
        }
        //20 个线程对同一个文件写操作
        for (int i = 0;i<20;i++){
            new Thread(()->{
                writeLock.lock();
                try {
                    //文件写操作
                } finally {
                    writeLock.unlock();
                }
            }).start();
        }
    }
}

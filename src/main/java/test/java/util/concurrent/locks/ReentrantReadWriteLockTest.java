package test.java.util.concurrent.locks;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/**
 * @author 覃国强
 * @date 2020-12-03 16:44
 */
public class ReentrantReadWriteLockTest {

  static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
  static ReadLock readLock = readWriteLock.readLock();
  static WriteLock writeLock = readWriteLock.writeLock();


  private static Runnable readRunnable() {
    return () -> {
      readLock.lock();
      try {
        System.out.println(Thread.currentThread().getName());
      } finally {
        readLock.unlock();
      }
    };
  }

  private static Runnable writeRunnable() {
    return () -> {
      writeLock.lock();
      try {
        System.out.println(Thread.currentThread().getName());
      } finally {
        writeLock.unlock();
      }
    };
  }

  private static void sleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {

    new Thread(() -> {
      writeLock.lock();
      try {
        System.out.println(Thread.currentThread().getName());
      } finally {
        writeLock.unlock();
      }
    }, "Write1").start();
    sleep(100);

    new Thread(() -> {
      readLock.lock();
      try {
        System.out.println(Thread.currentThread().getName());
      } finally {
        readLock.unlock();
      }
    }, "Reader1").start();
    sleep(100);
    new Thread(() -> {
      readLock.lock();
      try {
        System.out.println(Thread.currentThread().getName());
      } finally {
        readLock.unlock();
      }
    }, "Reader2").start();
    sleep(100);

  }


}

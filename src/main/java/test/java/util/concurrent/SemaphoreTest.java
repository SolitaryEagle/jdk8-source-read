package test.java.util.concurrent;

import java.util.concurrent.Semaphore;

/**
 * @author 覃国强
 * @date 2020-12-03 17:17
 */
public class SemaphoreTest {

  private static void sleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Semaphore sem = new Semaphore(0);

    new Thread(() -> {
      sem.acquireUninterruptibly();
      System.out.println(Thread.currentThread().getName() + " end");
    }, "acc1").start();
    sleep(100);


    new Thread(() -> {
      sem.acquireUninterruptibly();
      System.out.println(Thread.currentThread().getName() + " end");
    }, "acc2").start();
    sleep(100);

    new Thread(() -> {
      sem.release();
      System.out.println(Thread.currentThread().getName() + " end");
    }, "rele1").start();
    sleep(100);

    new Thread(() -> {
      sem.release();
      System.out.println(Thread.currentThread().getName() + " end");
    }, "rele2").start();
    sleep(100);
  }

}

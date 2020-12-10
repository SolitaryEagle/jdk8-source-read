package test.java.lang;

/**
 * @author 覃国强
 * @date 2020-12-10 22:00
 */
public class ThreadTest {

  private static final Object monitor = new Object();

  public static void main(String[] args) throws InterruptedException {
    new Thread(() -> {
      synchronized (monitor) {
        Thread.yield();
        Thread.yield();
        Thread.yield();
        Thread.yield();
        Thread.yield();
        System.out.println(Thread.currentThread().getName());
      }
    }).start();

    Thread.sleep(1000);

    new Thread(() -> {
      synchronized (monitor) {
        System.out.println(Thread.currentThread().getName());
      }
    }).start();

  }

}

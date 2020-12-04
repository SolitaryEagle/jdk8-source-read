package test.java.util.concurrent.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 覃国强
 * @date 2020-12-04 10:40
 */
public class ConditionTest {

  public static void main(String[] args) throws InterruptedException {
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    condition.await();
  }

}

package test.java.util.concurrent;

/**
 * @author 覃国强
 * @date 2021-01-23 17:04
 */
public class ThreadPoolExecutorTest {

  private static final int COUNT_BITS = Integer.SIZE - 3;
  private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

  private static final int RUNNING    = -1 << COUNT_BITS;
  private static final int SHUTDOWN   =  0 << COUNT_BITS;
  private static final int STOP       =  1 << COUNT_BITS;
  private static final int TIDYING    =  2 << COUNT_BITS;
  private static final int TERMINATED =  3 << COUNT_BITS;

  public static void main(String[] args) {
    System.out.println("COUNT_BITS: " + COUNT_BITS);
    System.out.println("CAPACITY: " + CAPACITY);

    System.out.println("COUNT_BITS BinaryString: " + toBinaryString(COUNT_BITS));
    System.out.println("CAPACITY BinaryString: " + toBinaryString(CAPACITY));
    System.out.println("CAPACITY BinaryString LENGTH: " + toBinaryString(CAPACITY).length());

    System.out.println("========================");

    System.out.println("RUNNING: " + RUNNING);
    System.out.println("SHUTDOWN: " + SHUTDOWN);
    System.out.println("STOP: " + STOP);
    System.out.println("TIDYING: " + TIDYING);
    System.out.println("TERMINATED: " + TERMINATED);
    System.out.println("RUNNING BinaryString: " + toBinaryString(RUNNING));
    System.out.println("SHUTDOWN BinaryString: " + toBinaryString(SHUTDOWN));
    System.out.println("STOP BinaryString: " + toBinaryString(STOP));
    System.out.println("TIDYING BinaryString: " + toBinaryString(TIDYING));
    System.out.println("TERMINATED BinaryString: " + toBinaryString(TERMINATED));





  }


  private static String toBinaryString(int num) {
    String binaryString = Integer.toBinaryString(num);
    StringBuilder sb = new StringBuilder(binaryString);
    while (sb.length() < 32) {
      sb.insert(0, 0);
    }
    return sb.toString();
  }


}

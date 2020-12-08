package test.java.util;

/**
 * @author 覃国强
 * @date 2020-12-08 21:33
 */
public class HashMapTest {

  public static void main(String[] args) {
    System.out.println(tableSizeFor(128));
    System.out.println(tableSizeFor(200));
    System.out.println(tableSizeFor(-200));

    System.out.println(Integer.toBinaryString(99));
  }

  static final int MAXIMUM_CAPACITY = 1 << 30;
  static final int tableSizeFor(int cap) {
    int n = cap - 1;
    n |= n >>> 1;
    n |= n >>> 2;
    n |= n >>> 4;
    n |= n >>> 8;
    n |= n >>> 16;
    return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
  }

}

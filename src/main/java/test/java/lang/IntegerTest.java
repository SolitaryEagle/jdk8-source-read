package test.java.lang;

/**
 * @author 覃国强
 * @date 2020-12-15 19:35
 */
public class IntegerTest {

  public static void main(String[] args) {
    testNumberOfLeadingZeros();

    // 0111 1111  1111 1111  1111 1111  1111 1111
    String s = Integer.toBinaryString(0x7fffffff);
    System.out.println(s);
  }


  public static void testNumberOfLeadingZeros() {
    System.out.println(Integer.numberOfLeadingZeros(-1234));
    System.out.println(Integer.numberOfLeadingZeros(0));
    System.out.println(Integer.numberOfLeadingZeros(1));
    System.out.println(Integer.numberOfLeadingZeros(1 << 16));
    System.out.println(Integer.numberOfLeadingZeros(1 << 30));
  }

}

package test.org.openjdk.jol.info;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author 覃国强
 * @date 2020-12-09 21:49
 */
public class ClassLayoutTest {

  public static void main(String[] args) {
    Object[] arr = new Object[4];
    arr[0] = new Object();
    arr[3] = new Object();
    System.out.println(ClassLayout.parseInstance(arr).toPrintable());

    byte[] bytes = new byte[4];
    System.out.println(ClassLayout.parseInstance(bytes).toPrintable());

    Object obj = new Object();
    System.out.println(ClassLayout.parseInstance(obj).toPrintable());


  }

}

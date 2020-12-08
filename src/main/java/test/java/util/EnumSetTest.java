package test.java.util;

import java.util.EnumSet;

/**
 * @author 覃国强
 * @date 2020-12-07 22:01
 */
public class EnumSetTest {

  public static void main(String[] args) {
    EnumSet<Color> set1 = EnumSet.of(Color.RED, Color.BLUE);
    EnumSet<Color> set2 = EnumSet.complementOf(set1);
    System.out.println(set1);
    System.out.println(set2);
  }



  private enum Color {

    RED,

    GREEN,

    YELLOW,

    BLUE

  }
}

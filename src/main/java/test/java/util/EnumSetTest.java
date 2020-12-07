package test.java.util;

import java.util.EnumSet;

/**
 * @author 覃国强
 * @date 2020-12-07 22:01
 */
public class EnumSetTest {

  public static void main(String[] args) {
    System.out.println(-1 >>> -3);

    EnumSet<Color> colors = EnumSet.allOf(Color.class);
    for (Color color : colors) {
      System.out.println(color);
    }
  }



  private enum Color {

    RED,

    GREEN,

    YELLOW

  }
}

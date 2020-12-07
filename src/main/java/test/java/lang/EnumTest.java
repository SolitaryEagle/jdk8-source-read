package test.java.lang;

import sun.misc.SharedSecrets;

/**
 * @author 覃国强
 * @date 2020-12-07 21:54
 */
public class EnumTest {

  public static void main(String[] args) {
    Color[] shared = SharedSecrets.getJavaLangAccess().getEnumConstantsShared(Color.class);
    for (Color color : shared) {
      System.out.println(color);
    }
  }

  private enum Color {

    RED,

    GREEN,

    YELLOW

  }
}




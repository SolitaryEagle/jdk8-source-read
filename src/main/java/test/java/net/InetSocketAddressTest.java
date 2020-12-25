package test.java.net;

import java.net.InetSocketAddress;

/**
 * @author 覃国强
 * @date 2020-12-23 15:08
 */
public class InetSocketAddressTest {

  public static void main(String[] args) {
    String domain = "";
    InetSocketAddress address = new InetSocketAddress(domain, 0);
    boolean unResolved = address.isUnresolved();
    System.out.println(unResolved);

    System.out.println(InetSocketAddress.class.getCanonicalName());
  }

}

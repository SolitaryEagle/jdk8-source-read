package test.java.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 覃国强
 * @date 2020-12-22 14:07
 */
public class InetAddressTest {

  public static void main(String[] args) throws UnknownHostException {
    System.out.println(InetAddress.getLocalHost());
    System.out.println(InetAddress.getLocalHost().getHostName());
    System.out.println(InetAddress.getLocalHost().getCanonicalHostName());
  }


}

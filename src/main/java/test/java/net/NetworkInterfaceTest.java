package test.java.net;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/**
 * @author 覃国强
 * @date 2020-12-22 14:51
 */
public class NetworkInterfaceTest {

  public static void main(String[] args) throws SocketException {
    for (Enumeration<NetworkInterface> nics = NetworkInterface.getNetworkInterfaces();
        nics.hasMoreElements(); ) {
      NetworkInterface ifc = nics.nextElement();

      System.out.println("======= ifc.getInterfaceAddresses() ========");
      List<InterfaceAddress> interfaceAddresses = ifc.getInterfaceAddresses();
      for (InterfaceAddress interfaceAddress : interfaceAddresses) {
        System.out.println("-----------------------");
        System.out.println(interfaceAddress.getAddress());
        System.out.println(interfaceAddress.getBroadcast());
        System.out.println(interfaceAddress.getNetworkPrefixLength());
      }

      System.out.println("============ifc.getInetAddresses()===========");
      for (Enumeration<InetAddress> inetAddresses = ifc.getInetAddresses();
          inetAddresses.hasMoreElements(); ) {
        System.out.println("-----------------------");
        InetAddress inetAddress = inetAddresses.nextElement();
        System.out.println(inetAddress.getCanonicalHostName());
        System.out.println(Arrays.toString(inetAddress.getAddress()));
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());
      }

      System.out.println("========== ifc.getSubInterfaces() =======");
      for (Enumeration<NetworkInterface> subInterfaces = ifc.getSubInterfaces();
          subInterfaces.hasMoreElements(); ) {
        System.out.println("-----------------------");
        System.out.println(subInterfaces.nextElement());
      }

      System.out.println("====================================");
    }
  }

  public static void testNetworkInterface() {
    try {
      for (Enumeration<NetworkInterface> nics = NetworkInterface.getNetworkInterfaces();
          nics.hasMoreElements(); ) {
        NetworkInterface ifc = nics.nextElement();
        System.out.println(ifc.getIndex());
        System.out.println(ifc.getName());
        System.out.println(ifc.getDisplayName());
        System.out.println(ifc.getInterfaceAddresses());
        System.out.println(Arrays.toString(ifc.getHardwareAddress()));
        System.out.println(ifc.getInetAddresses());
        System.out.println(ifc.getMTU());
        System.out.println(ifc.getParent());
        System.out.println(ifc.getSubInterfaces());
        System.out.println("====================================");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

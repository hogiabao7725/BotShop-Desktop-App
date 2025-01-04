package OtherFunction;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class IPv4AddressHelper {

    public static String getIPv4Address() {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface iface = interfaces.nextElement();
                // Lọc ra các interface không phải là loopback và đang hoạt động
                if (iface.isLoopback() || !iface.isUp()) {
                    continue;
                }
                Enumeration<InetAddress> addresses = iface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();
                    // Chỉ lấy địa chỉ IPv4
                    if (addr.getAddress().length == 4) {
                        return addr.getHostAddress();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Trả về null nếu không tìm thấy địa chỉ IPv4
    }

//    public static void main(String[] args) {
//        String ipv4 = getIPv4Address();
//        if (ipv4 != null) {
//            System.out.println("IPv4 Address: " + ipv4);
//        } else {
//            System.out.println("IPv4 Address not found.");
//        }
//    }
}


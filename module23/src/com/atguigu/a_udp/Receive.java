package com.atguigu.a_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName: Receive
 * Package: com.atguigu.a_udp
 * Description:
 *
 * @Author LiKang
 * @Create 2024/11/18 14:45
 * @Version 1.0
 */
public class Receive {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(6666);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        socket.receive(dp);
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println(new String(data,0,len));
        System.out.println(address+"....."+port);
        socket.close();
    }
}

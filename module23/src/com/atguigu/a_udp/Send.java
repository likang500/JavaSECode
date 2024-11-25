package com.atguigu.a_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName: Send
 * Package: com.atguigu.a_udp
 * Description:
 *UDP 发送端（客户端）
 * @Author LiKang
 * @Create 2024/11/18 14:39
 * @Version 1.0
 */
public class Send {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();
        byte[] bytes= "你好".getBytes();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 6666;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, ip, port);
        socket.send(dp);
        socket.close();
    }
}

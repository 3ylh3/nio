package com.xiaobai.nio.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * client2
 *
 * @author yin_zhj
 * @date 2020/5/6
 */
public class Client2 {
    public static void main(String[] args) throws IOException,InterruptedException {
        SocketChannel sc = SocketChannel.open();
        sc.configureBlocking(false);
        sc.connect(new InetSocketAddress(9999));
        sc.finishConnect();
        byte[] bytes = "client2 say hello".getBytes();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put(bytes);
        buffer.flip();
        sc.write(buffer);
    }
}

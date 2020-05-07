package com.xiaobai.nio.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/**
 * client1
 *
 * @author yin_zhj
 * @date 2020/5/6
 */
public class Client1 {
    public static void main(String[] args) throws IOException,InterruptedException {
        SocketChannel sc = SocketChannel.open();
        sc.configureBlocking(false);
        sc.connect(new InetSocketAddress(8888));
        sc.finishConnect();
        byte[] bytes = "client1 say hello".getBytes();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put(bytes);
        buffer.flip();
        sc.write(buffer);
    }
}

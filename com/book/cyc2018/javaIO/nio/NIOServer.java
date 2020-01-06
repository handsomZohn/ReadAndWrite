package com.book.cyc2018.javaIO.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @Description nio-server
 * @CreateDate 18/07/31 10:37
 * @Author zohn
 * @Version 1.0
 */
public class NIOServer {
    // ͨ��������
    private Selector selector;

    /**
     * ��ȡһ��ServerSocketͨ�������Ը�ͨ����һЩ��ʼ������
     *
     * @param port �󶨵Ķ˿ں�
     * @throws IOException
     */
    public void initServer(int port) throws IOException {
        // ��ȡһ��ServerSocketͨ��
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // ����ͨ��Ϊ������
        serverSocketChannel.configureBlocking(false);
        // ����ͨ����Ӧ��ServerSocket�󶨵�port�˿�
        serverSocketChannel.socket().bind(new InetSocketAddress(port));
        // ��ȡһ��ͨ��������
        this.selector = Selector.open();
        // ��ͨ����������ͨ���󶨣�����Ϊ��ͨ��ע��SelectionKey.OP_ACCEPT��ע����¼���
        // �����¼�����ʱ��selector.select()�᷵�أ�����¼�û����selector.select()��һֱ����
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

    }

    /**
     * ������ѯ�ķ�ʽ����selector���Ƿ�����Ҫ������¼�������У�����д���
     *
     * @throws IOException
     */
    public void listen() throws IOException {
        System.out.println("�������������ɹ�");
        // ��ѯ����selector
        while (true) {
            // ��ע���ʱ�䵽��ʱ���������أ�����÷�����һֱ������
            selector.select();
            // ���selector��ѡ�е���ĵ����� ѡ�е���Ϊע����¼�
            Iterator<SelectionKey> keyIterator = this.selector.selectedKeys().iterator();
            while (keyIterator.hasNext()){
                SelectionKey key = keyIterator.next();
                // ɾ����ѡ��key����ֹ�ظ�����
                keyIterator.remove();
                // �ͻ������������¼�
                if (key.isAcceptable()){
                    ServerSocketChannel server = (ServerSocketChannel) key.channel();
                    // ��úͿͻ������ӵ�ͨ��
                    SocketChannel channel = server.accept();
                    // ����Ϊ������
                    channel.configureBlocking(false);
                    // ���ͻ��˷�����Ϣ
                    channel.write(ByteBuffer.wrap(new String("��ͻ��˷���һ����Ϣ").getBytes()));
                    // �ںͿͻ������ӳɹ�֮��Ϊ�˿��Խ��յ��ͻ��˵���Ϣ����Ҫ��ͨ�����ö���Ȩ�ޡ�
                    channel.register(this.selector, SelectionKey.OP_READ);
                } else if (key.isReadable()) {
                        read(key);
                }
            }
        }
    }

    /**
     * ��ȡ�ͻ��˷�����Ϣ�ķ���
     * @param key
     * @throws IOException
     */
    public void read (SelectionKey key) throws IOException{
        // �������ɶ�ȡ��Ϣ���õ��¼�������Socketͨ��
        SocketChannel channel = (SocketChannel)key.channel();
        // ������ȡ�Ļ�����
        ByteBuffer buffer = ByteBuffer.allocate(10);
        channel.read(buffer);
        byte[] data = buffer.array();
        String msg = new String(data).trim();
        System.out.println("���������յ�����Ϣ��" + msg);
        ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
        // ��Ϣ���ؿͻ���
        channel.write(outBuffer);
    }

    /**
     * ���������
     * @param args
     */
    public static void main(String[] args) throws IOException{
        NIOServer server = new NIOServer();
        server.initServer(8088);
        server.listen();
    }
}

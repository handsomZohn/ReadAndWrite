package com.cyc2018.javaIO.nio;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 *@Description  nio-client
 *@CreateDate   18/07/31 11:32
 *@Author        zohn
 *@Version       1.0
 *
 */
public class NIOClient {
    // ͨ��������
    private Selector selector;

    /**
     * ���һ��Socketͨ�������Ը�ͨ����һЩ��ʼ������
     * @param ip Ҫ���ӵķ�������IP��ַ
     * @param port Ҫ���ӵķ������Ķ˿�
     * @throws IOException
     */
    public void initClient(String ip, int port) throws IOException {
        // ���һ��Socketͨ��
        SocketChannel channel = SocketChannel.open();
        // ����ͨ��Ϊ������
        channel.configureBlocking(false);
        // ���һ��ͨ��������
        this.selector = Selector.open();
        // �ͻ������ӷ���������ʵ����ִ�в�û�н������ӣ���Ҫ��listen���������е���channel.finishConnect();�����������
        channel.connect(new InetSocketAddress(ip, port));
        // ��ͨ���������͸�ͨ���󶨣���Ϊ��ͨ��ע��SeletionKey.OP_CONNECT�¼���
        channel.register(selector, SelectionKey.OP_CONNECT);
    }

    /**
     * ������ѵ�ķ�ʽ����selector���Ƿ�����Ҫ������¼�������У�����д���
     * @throws IOException
     */
    public void listen() throws IOException {
        // ��ѯselector
        while (true) {
            selector.select();
            // ��ȡselector��ѡ����ĵ�����
            Iterator<SelectionKey> keyIterator = this.selector.selectedKeys().iterator();
            while (keyIterator.hasNext()){
                SelectionKey key = keyIterator.next();
                // ɾ��ѡ�е�key��ֹ�ظ�����
                keyIterator.remove();
                // �����¼�����
                if (key.isConnectable()){
                    SocketChannel channel = (SocketChannel) key.channel();
                    // ����������� ���������
                    if (channel.isConnectionPending()){
                        channel.finishConnect();
                    }
                    // ���óɷ�����
                    channel.configureBlocking(false);

                    // �����������˷�����Ϣ
                    channel.write(ByteBuffer.wrap(new String("�����������һ����Ϣ").getBytes()));

                    // �ںͷ����������ӳɹ�֮��Ϊ�˿��Խ��յ�����˵���Ϣ����Ҫ��ͨ�����ö���Ȩ�ޡ�
                    channel.register(this.selector, SelectionKey.OP_READ);
                } else if (key.isReadable()) {
                    read(key);
                }
            }
        }
    }

    /**
     * ����������˷�������Ϣ �¼�
     * @param key
     * @throws IOException
     */
    public void read (SelectionKey key) throws IOException {
        // �ͻ��˿ɶ�ȡ��Ϣ���õ��¼�������Socketͨ��
        SocketChannel channel = (SocketChannel) key.channel();
        // ������ȡ�Ļ�����
        ByteBuffer buffer = ByteBuffer.allocate(10);
        channel.read(buffer);
        byte[] data = buffer.array();
        String msg = new String(data).trim();
        System.out.println("������յ���Ϣ��"+msg);
        ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
        channel.write(outBuffer);// ����Ϣ���͸��ͻ���
    }

    /**
     * �����ͻ��˲���
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        NIOClient client = new NIOClient();
        client.initClient("localhost",8088);
        client.listen();
    }
}

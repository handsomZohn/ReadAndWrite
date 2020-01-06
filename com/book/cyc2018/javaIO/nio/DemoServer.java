package com.book.cyc2018.javaIO.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoServer extends Thread {
    private ServerSocket serverSocket;
    private ExecutorService executorService;

    public int getPort() {
        return serverSocket.getLocalPort();
    }

    public void run(){
        try {
            serverSocket = new ServerSocket(0);
            // �߳�ʵ���ǱȽ�����������Դ �������ߴ����߳��������Կ����ģ�ÿ���̶߳��е������߳�ջ�Ƚṹ
            // ��Ҫռ�����Ե��ڴ棬����ÿ��client����һ���߳����˷ѵ�
            // ���������̳߳ػ����������˷�
            executorService = Executors.newFixedThreadPool(8);
            //ͨ��һ���̶���С���̳߳أ�������������̣߳�����Ƶ�������������̵߳Ŀ���
            while (true) {
                Socket socket = serverSocket.accept();
                RequestHandler requestHandler = new RequestHandler(socket);
                executorService.execute(requestHandler);
                //requestHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        DemoServer demoServer = new DemoServer();
        demoServer.start();
        try (Socket client = new Socket(InetAddress.getLocalHost(), demoServer.getPort())) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            bufferedReader.lines().forEach(s -> System.out.println(s));
        }
    }
}

class RequestHandler extends Thread{
    private Socket socket;
    RequestHandler (Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try(PrintWriter out = new PrintWriter(socket.getOutputStream())){
            out.print("Hello World");
            out.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

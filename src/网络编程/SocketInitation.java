package 网络编程;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/1 下午 3:39
 * *@Description This is a description of SocketInitation
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class SocketInitation {

    public static void main(String[] args) {


    }


    @Test
    public void clientFor1() throws UnknownHostException, IOException {

        String server = "127.0.0.1";
        byte[] data = String.valueOf(8899).getBytes();

        Socket s = new Socket("127.0.0.1", 8899);

        InputStream is = s.getInputStream();

        OutputStream os = s.getOutputStream();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("Test the correspondence between client and server,server returns data to client after receiving the message.");

        bw.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String message = br.readLine();
        System.out.println("server:\t" + message);


    }


    @Test
    public void serverFor1() throws UnknownHostException, IOException {

        ServerSocket ss = new ServerSocket(8899);
        System.out.println("launch server...");

        Socket s = ss.accept();
        System.out.println("Server:\t" + InetAddress.getLocalHost().getHostAddress() + "had triumphantly launched!");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String message = br.readLine();
        System.out.println("Server:\t\t" + br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        bw.write(message + "\n");
        bw.flush();


    }

    @Test
    public void clientFor2() throws UnknownHostException, IOException {

        Socket s = new Socket(InetAddress.getLocalHost().getHostAddress(), 9900);

        OutputStream os = s.getOutputStream();
        String message = "How are you.";
        s.getOutputStream().write(message.getBytes("UTF-8"));


        os.close();
        s.close();

    }

    @Test
    public void serverFor2() throws UnknownHostException, IOException {

        ServerSocket ss = new ServerSocket(9900);
        System.out.println("Server will waiting for the coming of correspndence perpetually!");
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        StringBuilder sb = new StringBuilder();

        int len = -1;
        while ((len = is.read(b, 0, b.length)) != -1) {

            sb.append(new String(b, 0, len, "UTF-8"));

        }

        System.out.println("get message from client:\t\t" + sb);

        is.close();
        s.close();
        ss.close();


    }


    @Test
    public void serverFor3() throws UnknownHostException, IOException {

        ServerSocket ss = new ServerSocket(8848);
        Socket s = ss.accept();
        System.out.println("Server will waiting for the coming of client perpetually!");

        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        int len = -1;

        StringBuilder sb = new StringBuilder();

        while ((len = is.read(b, 0, b.length)) != -1) {

            sb.append(new String(b, 0, len, "UTF-8"));

        }

        System.out.println("Get message from client:\t\t" + sb);


        OutputStream os = s.getOutputStream();
        os.write("Hello Client, I have gotten message from you!".getBytes("UTF-8"));

        is.close();
        os.close();
        s.close();
        ss.close();


    }

    @Test
    public void clientFor3() throws UnknownHostException, IOException {

        Socket s = new Socket(InetAddress.getLocalHost().getHostAddress(), 8848);

        OutputStream os = s.getOutputStream();

        String message = "您好，哄哄哈嘿";
        s.getOutputStream().write(message.getBytes("UTF-8"));

        s.shutdownOutput();

        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        int len = -1;
        StringBuilder sb = new StringBuilder();

        while ((len = is.read(b, 0, b.length)) != -1) {

            sb.append(new String(b, 0, len, "UTF-8"));

        }

        System.out.println("get message from server:\t\t" + sb);

        is.close();
        os.close();
        s.close();


    }


}

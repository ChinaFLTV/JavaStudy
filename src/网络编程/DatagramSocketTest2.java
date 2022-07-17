package 网络编程;

import org.junit.Test;

import java.io.*;
import java.net.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/3 上午 9:08
 * *@Description This is a description of DatagramSocketTest2
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class DatagramSocketTest2 {

    public static void main(String[] args) throws IOException, MalformedURLException {

        URL url = new URL("http://www.atguigu.com");
        System.out.println(url);
        URL download = new URL(url, "download.html");
        System.out.println(download);
        URL url1 = new URL("http", "www.atguigu.com", "download.html");
        System.out.println(url1);
        URL url2 = new URL("http", "www.atguigu.com", 8080, "download.html");
        System.out.println(url2);


        URL url3 = new URL("https", "www.baidu.com", "download.html");
        System.out.println(url3.getProtocol());
        System.out.println(url3.getHost());
        System.out.println(url3.getPort());
        System.out.println(url3.getPath());
        System.out.println(url3.getFile());
        System.out.println(url3.getQuery());

        URL url4 = new URL("https://s.weibo.com/weibo?q=%E9%9E%A0%E5%A9%A7%E7%A5%8E");
        System.out.println(url4.getProtocol());
        System.out.println(url4.getHost());
        System.out.println(url4.getPath());
        System.out.println(url4.getFile());
        System.out.println(url4.getQuery());
        URLConnection urlc = url4.openConnection();

        Object o = urlc.getContent();
        System.out.println(o);
        int i = urlc.getContentLength();
        System.out.println(i);
        String type = urlc.getContentType();
        System.out.println(type);
        long l = urlc.getDate();
        Date d = new Date();
        d.setTime(l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd hh-mm-ss");
        System.out.println(sdf.format(d));
        System.out.println(l);

        long l1 = urlc.getLastModified();

        Date d1 = new Date();

        d1.setTime(l1);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM--dd hh-MM-ss");
        System.out.println(sdf1.format(d1));

        InputStream is = urlc.getInputStream();
        //OutputStream os = urlc.getOutputStream();

        byte[] b = new byte[8192];
        is.read(b);
        System.out.println(new String(b));
        System.out.println("----------exquisite segment line-----------");

        new Server();
        new Client();







    }

    @Test
    public void client_DatagramSocket() throws SocketException, UnknownHostException, IOException {

        DatagramSocket ds = new DatagramSocket();
        byte[] b = "能不能给我一首歌的时间？".getBytes();

        DatagramPacket dp = new DatagramPacket(b, 0, b.length, InetAddress.getLocalHost(), 6666);

        ds.send(dp);

    }

    @Test
    public void server_DatagramSocket() throws SocketException, UnknownHostException, IOException {

        DatagramSocket ds = new DatagramSocket(6666);
        byte[] b_big = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b_big, b_big.length);
        ds.receive(dp);
        System.out.println(new String(b_big, 0, dp.getLength()));
        System.out.println(dp.getPort());
        System.out.println(dp.getData());
        System.out.println(dp.getAddress());


    }


    @Test
    public void client_DatagramSocket1() throws SocketException, IOException, UnknownHostException {

        DatagramSocket ds = new DatagramSocket();
        Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\寒假视频录制作业计划.md");
        File f = p.toFile();
        RandomAccessFile raf = new RandomAccessFile(f, "rwd");
        byte[] b = new byte[1024];
        raf.read(b, 0, b.length);

        DatagramPacket dp = new DatagramPacket(b, 0, b.length, InetAddress.getLocalHost(), 8899);

        ds.send(dp);


    }

    @Test
    public void server_DatagramSocket2() throws SocketException, UnknownHostException, IOException {

        DatagramSocket ds = new DatagramSocket(8899);

        byte[] b = new byte[1024];

        DatagramPacket dp = new DatagramPacket(b, 0, b.length, InetAddress.getLocalHost(), 8899);

        ds.receive(dp);
        System.out.println(dp.getLength());

        System.out.println(new String(b, 0, dp.getLength()));


    }


}


class Server {

    private ServerSocket ss;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public Server() {
        try {

            ss = new ServerSocket(10000);

            while (true) {

                String RemoteIP = InetAddress.getLocalHost().getHostAddress();
                String RemotePort = ":" + socket.getLocalPort();
                System.out.println("A client come in!\tIP: " + RemoteIP + RemotePort);

                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String line = in.readLine();
                System.out.println("Client send is : " + line);
                out = new PrintWriter(socket.getOutputStream(), true);
                out.println("Your message has received!");

                out.close();
                in.close();
                socket.close();
                ss.close();


            }


        } catch (SocketException se) {

            se.getSuppressed();
            se.getSuppressed();

        } catch (UnknownHostException nhe) {

            nhe.getCause();
            nhe.getMessage();

        } catch (IOException ioe) {

            ioe.getLocalizedMessage();
            ioe.printStackTrace();

        }


    }


}

class Client {

    public Socket socket;
    public BufferedReader in;
    private PrintWriter out;

    public Client() {

        try {

            System.out.println("Try to connect 127.0.0.1:10000");
            socket = new Socket("127.0.0.1", 10000);
            System.out.println("The server is connected!");
            System.out.println("Please enter some characters!");
            BufferedReader line = new BufferedReader(new InputStreamReader(System.in));

            out = new PrintWriter(socket.getOutputStream(), true);
            out.println(line.readLine());
            out.close();
            //in.close();
            socket.close();

        } catch (IOException ioe) {

            ioe.getLocalizedMessage();
            ioe.printStackTrace();


        }

    }


}

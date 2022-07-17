package 网络编程;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/2 上午 10:36
 * *@Description This is a description of DatagramSocketTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class DatagramSocketTest {

    public static void main(String[] args) throws UnknownHostException {


        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getByName("127.0.0.1"));
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        System.out.println(InetAddress.getLocalHost().getHostName());

    }

    @Test
    public void client() throws SocketException, IOException {

        DatagramSocket ds = new DatagramSocket();
        byte[] b = "hello,atguigu.com".getBytes();

        DatagramPacket dp = new DatagramPacket(b, 0, b.length, InetAddress.getLocalHost(), 8899);

        ds.send(dp);


    }

    @Test
    public void server() throws UnknownHostException, SocketException, IOException {

        DatagramSocket ds = new DatagramSocket(8899);
        byte[] b = new byte[1024];

        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);
        String s = new String(b, 0, dp.getLength());
        System.out.println(s + "---" + dp.getAddress());


    }

    @Test
    public void clientFor2() throws FileNotFoundException, IOException, SocketException {

        RandomAccessFile raf = new RandomAccessFile(new File("C:\\Users\\Lenovo\\Desktop\\寒假视频录制作业计划.md"), "rws");
        byte[] b = new byte[1024];
        raf.read(b, 0, b.length);

        DatagramSocket ds = new DatagramSocket();

        DatagramPacket dp = new DatagramPacket(b, 0, b.length, InetAddress.getLocalHost(), 6677);
        ds.send(dp);


    }

    @Test
    public void serverFor2() throws SocketException, IOException, UnknownHostException {

        byte[] b = new byte[1024];
        DatagramSocket ds = new DatagramSocket(6677);
        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);

        Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\transcript.md");

        if (Files.notExists(p)) {

            Files.createFile(p);

        }

        File f = p.toFile();
        RandomAccessFile raf = new RandomAccessFile(f, "rwd");

        raf.write(b, 0, dp.getLength());


    }

    @Test
    public void clientFor3() throws IOException, UnknownHostException, SocketException {

        DatagramSocket ds = new DatagramSocket();
        Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\img.jpg");
        long l = Files.size(p);
        byte[] b = new byte[(int) l];
        RandomAccessFile raf = new RandomAccessFile(new File("C:\\Users\\Lenovo\\Desktop\\img.jpg"), "rwd");

        raf.read(b, 0, b.length);

        DatagramPacket dp = new DatagramPacket(b,0,b.length,InetAddress.getLocalHost(),6666);

        ds.send(dp);


    }


    @Test
    public void serverFor3()throws SocketException,IOException,UnknownHostException {

        DatagramSocket ds= new DatagramSocket(6666);
        byte[] b = new byte[8192];
        DatagramPacket dp = new DatagramPacket(b,b.length);

        ds.receive(dp);

        byte[] b1 = new byte[dp.getLength()];

        Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\transcript.jpg");
        if(Files.notExists(p)){

            Files.createFile(p);

        }


        RandomAccessFile raf = new RandomAccessFile(new File("C"),"rwd");


    }

}

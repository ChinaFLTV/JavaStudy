package 网络编程;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/1 下午 12:31
 * *@Description This is a description of SocketPractice1
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class SocketPractice1 {

    public static void main(String[] args) {


    }


    @Test
    public void clientForPictureTransfer() throws UnknownHostException, IOException {

        Socket s = new Socket(InetAddress.getLocalHost().getHostAddress(), 6666);
        OutputStream os = s.getOutputStream();
        InputStream is = s.getInputStream();

/*        Path p1 = Paths.get("C:\\Users\\Lenovo\\Desktop\\img.jpg");
        long l = Files.size(p1);
        byte[] b = new byte[(int) l + 1024];*/

        byte[] length_binary = new byte[4];
        int read;
        int length = 0;
        while ((read = is.read(length_binary, 0, length_binary.length)) != -1) {

            length = new Integer(Byte.parseByte(new String(length_binary, 0, read))).intValue();

        }

        byte[] b2 =new byte[length];

        is.read(b2,0,b2.length);
        String str = new String(b2);
        Path p3  =Paths.get(str);
        Path p4 = Paths.get("C:\\Users\\Lenovo\\Desktop\\");
        Files.copy(p3,p4);



        //is.read(b);

/*        Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\transcript.jpg");
        //Files.createFile(p);

        RandomAccessFile raf = new RandomAccessFile(p.toFile(), "rwd");
        raf.write(b);


        os.write("hello world".getBytes());
        os.flush();*/


    }


    @Test
    public void serverForPictureTransfer() throws UnknownHostException, IOException {

        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();

        OutputStream os = s.getOutputStream();
        InputStream is = s.getInputStream();

        DataInputStream dis = new DataInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\img.jpg")));

/*        Path p1 = Paths.get("C:\\Users\\Lenovo\\Desktop\\img.jpg");
        long l = Files.size(p1);


        byte[] b2 = new byte[1024];*/

        //byte[] b2 = new byte[8192];
        //dis.read(b2, 0, b2.length);
        String str = "C:\\Users\\Lenovo\\Desktop\\img.jpg";
        int length = str.length();

        os.write(new Integer(length).byteValue());


        os.write(str.getBytes());


/*        byte[] b = new byte[1024];

        int read = -1;
        while ((read = is.read(b, 0, b.length)) != -1) {

            System.out.println(new String(b, 0, read).toUpperCase());

        }

        String str = new String(b, 0, read).toUpperCase();

        os.write(str.getBytes());*/


    }

}

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
 * *@Data 2022/3/31 下午 10:43
 * *@Description This is a description of SocketPractice
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class SocketPractice {

    public static void main(String[] args) {


    }


    @Test
    public void client() throws IOException {

        Socket s = null;
        OutputStream os = null;

        try {

            s = new Socket(InetAddress.getLocalHost().getHostAddress(), 8848);
            os = s.getOutputStream();
            os.write("SR文本传输2.0".getBytes());


        } catch (UnknownHostException nhe) {

            nhe.getLocalizedMessage();
            nhe.printStackTrace();

        } catch (IOException ioe) {

            ioe.printStackTrace();
            ioe.getCause();
            ioe.getLocalizedMessage();

        } finally {

            if (os != null) {

                os.close();

            }

            if (s != null) {

                s.close();

            }

        }

    }


    @Test
    public void server() throws IOException, UnknownHostException {

        ServerSocket ss = null;
        Socket s = null;
        InputStream is = null;


        ss = new ServerSocket(8848);
        s = ss.accept();

        is = s.getInputStream();

        char[] c = new char[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        br.read(c, 0, c.length);

        System.out.println(new String(c));


        if (ss != null) {

            ss.close();

        }

        if (s != null) {

            s.close();

        }

        if (is != null) {

            is.close();

        }


    }


    @Test
    public void clientForFileTransfer() throws IOException, UnknownHostException {

        Socket s1 = new Socket(InetAddress.getLocalHost().getHostAddress(), 8847);
        OutputStream os1 = s1.getOutputStream();
        RandomAccessFile raf = new RandomAccessFile(new File("C:\\Users\\Lenovo\\Desktop\\寒假视频录制作业计划.md"), "rws");
        byte[] b1 = new byte[1024];

        //raf.read(b1, 0, b1.length);

        os1.write(b1, 0, b1.length);


        InputStream is = s1.getInputStream();

        byte[] b = new byte[1024];
        is.read(b, 0, b.length);


        if (new String(b) == "返回成功") {

            System.out.println("Successfully get message from server!:\t\t" + new String(b));

        } else {

            System.out.println("It's a pity that we failed to get message from server.\t\t" + new String(b));

        }




/*        if (raf != null) {

            raf.close();

        }


        if (os1 != null) {

            os1.close();

        }

        if (s1 != null) {

            s1.close();

        }*/

    }

    @Test

    public void ServerForFileTransfer() throws IOException, UnknownHostException {

        ServerSocket ss1 = new ServerSocket(8847);
        Socket s2 = ss1.accept();
        InputStream is = s2.getInputStream();

        byte[] b = new byte[1024];

        is.read(b, 0, b.length);


        //File f = new File("C:\\Users\\Lenovo\\Desktop\\transcript.md");


        Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\transcript.md");
        //Files.createFile(p);
        File f = p.toFile();

        FileOutputStream fos = new FileOutputStream(f);


        fos.write(b);

        fos.flush();
        OutputStream os2 = s2.getOutputStream();

        //byte[] b1 = new byte[1024];
        os2.write("返回成功".getBytes());

        os2.flush();


    }


    @Test
    public void clientForVersion2() throws IOException, UnknownHostException {

        Socket s = new Socket(InetAddress.getLocalHost().getHostAddress(), 8888);
        OutputStream os = s.getOutputStream();
        InputStream is = s.getInputStream();

        Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\c__s.txt");
        //Files.createFile(p);

        File f = p.toFile();
        RandomAccessFile raf = new RandomAccessFile(f, "rwd");
        raf.write("File Transfer For Restored Version".getBytes());

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\c__s.txt")));

        byte[] b = new byte[1024];

        dis.read(b, 0, b.length);

        os.write(b);
        os.flush();

        char[] c = new char[1024];

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        int count = 0;
        int read = -1;
        while ((read = br.read()) != -1) {

            c[count] = (char) read;
            count++;

        }

        if ((new String(c, 0, count)) == "文件传输2.0版本") {

            System.out.println("successfully get message from server!:\t\t" + new String(c, 0, count));

        } else {

            System.out.println("Failed to get message from server");

        }


    }

    @Test
    public void serverFor2() {

        try {

            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            InputStream is = s.getInputStream();

            byte[] b = new byte[1024];

            is.read(b, 0, b.length);

            Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\s__c.txt");
            //Files.createFile(p);
            File f = p.toFile();

            char[] c = new char[1024];

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new DataOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\s__c.txt")))));

            BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(is)));

            int read = '\0';
            while ((read = br.read()) != -1) {

                bw.write((char) read);
                bw.flush();

            }


            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(os));
            char[] c1 = "文件传输2.0版本".toCharArray();

            bw1.write(c1, 0, c1.length);
            bw1.flush();

        } catch (UnknownHostException uhe) {

            uhe.getLocalizedMessage();
            uhe.printStackTrace();


        } catch (IOException ioe) {

            ioe.getLocalizedMessage();
            ioe.printStackTrace();


        }


    }


}

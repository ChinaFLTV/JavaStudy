package 网络编程;


import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/31 上午 8:47
 * *@Description This is a description of IPandPort
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class IPandPort {

    public static void main(String[] args) {

        try {

            InetAddress ia = InetAddress.getByName("www.atguigu.com");
            System.out.println(ia);
            InetAddress ia1 = InetAddress.getByName("www.baidu.com");
            System.out.println(ia1);
            InetAddress ia2 = InetAddress.getByName("www.google.com");
            System.out.println(ia2);
            System.out.println(ia.getHostName());
            System.out.println(ia1.getHostAddress());

            InetAddress ia3 = InetAddress.getLocalHost();
            System.out.println(ia3);
            System.out.println(ia3.getHostName());
            System.out.println(ia3.getHostAddress());

            InetAddress ia4 = InetAddress.getByName("www.tencent.com");
            System.out.println(ia4);
            InetAddress ia5 = InetAddress.getByName("www.China.com");
            System.out.println(ia5.isReachable(200));

            System.out.println(InetAddress.getByName("www.baidu.com").isReachable(200));
            System.out.println(ia5.getHostAddress());

            System.out.println("------------------exquisite segment line-----------------");
            System.out.println(InetAddress.getLocalHost().getHostAddress());

/*            Socket s = new Socket("127.0.0.1",9999);

            OutputStream os = s.getOutputStream();



            os.write("hello world".getBytes());*/

            //s.close();

            ServerSocket ss = new ServerSocket(9999);
            Socket s1 = ss.accept();
            byte[] b = new byte[1024];
            InputStream is = s1.getInputStream();
            is.read(b, 0, b.length);

            System.out.println(new String(b));
            s1.close();
            ss.close();


            System.out.println("---------test--------");


        } catch (UnknownHostException nhe) {

            nhe.getMessage();
            nhe.printStackTrace();

        } catch (IOException ioe) {

            ioe.getLocalizedMessage();
            ioe.printStackTrace();

        }

    }

    @Test
    public void client() {

        InetAddress ia6 = null;
        try {
            ia6 = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        Socket s2 = null;
        try {
            s2 = new Socket(ia6, 8899);
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream os2 = null;
        try {
            os2 = s2.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            os2.write("hello world".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void server() {

        try {


            ServerSocket ss1 = new ServerSocket(8899);
            Socket s7 = ss1.accept();

            InputStream is2 = s7.getInputStream();
            byte[] b = new byte[11];
            is2.read(b, 0, b.length);
            System.out.println(new String(b));

            s7.close();
            ss1.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void client1() throws IOException {

        OutputStream os3 = null;
        try {

            Socket s8 = new Socket("127.0.0.1", 8848);
            os3 = s8.getOutputStream();
            os3.write("heiheihei".getBytes());


        } catch (UnknownHostException uhe1) {

            uhe1.getMessage();
            uhe1.printStackTrace();

        } catch (IOException ioe1) {

            ioe1.getLocalizedMessage();
            ioe1.printStackTrace();

        } finally {

            if (os3 != null) {

                os3.close();

            }
        }


    }


    @Test
    public void Server1() throws IOException {

        ServerSocket ss3 = null;
        InputStream is6 = null;
        Socket s8 = null;

        try {

            ss3 = new ServerSocket(8848);
            s8 = ss3.accept();
            is6 = s8.getInputStream();
            byte[] b1 = new byte[9];
            is6.read(b1, 0, b1.length);
            System.out.println(new String(b1));

        } catch (IOException ioe2) {

            ioe2.getCause();
            ioe2.getMessage();
            ioe2.printStackTrace();


        }finally{

            if(ss3!=null){

                ss3.close();

            }

            if(s8!=null){

                s8.close();

            }

            if(is6!=null){

                is6.close();

            }


        }


    }


}

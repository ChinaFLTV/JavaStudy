package 网络编程;

import org.junit.Test;

import java.io.*;
import java.net.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/4 上午 8:20
 * *@Description This is a description of SocketPractice4
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class SocketPractice4 {

    public int fakeAge;
    public String fakeName;

    public static void main(String[] args) {


    }

    @Test
    public void Server1() {

        ServerSocket serverSocket;
        Socket socket;
        OutputStream out;
        InputStream in;


        try {

            serverSocket = new ServerSocket(6666);
            socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\python学习大礼包.txt"))));
            char[] c = new char[1024];
            br.read(c, 0, c.length);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            bw.write(c);
            bw.flush();
            socket.shutdownOutput();


        } catch (UnknownHostException uhe) {

            uhe.printStackTrace();
            uhe.getLocalizedMessage();

        } catch (IOException ioe) {

            ioe.getCause();
            ioe.getLocalizedMessage();

        }


    }

    @Test
    public void Client1() {

        Socket socket;
        OutputStream out;
        InputStream in;


        try {

            socket = new Socket(InetAddress.getLocalHost(), 6666);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            char[] c = new char[1024];
            br.read(c);
            socket.shutdownInput();

            PrintWriter pw = new PrintWriter(new PrintStream(System.out), true);
            pw.write(new String(c));
            pw.println("I have received your file!");


        } catch (IOException ioe) {

            ioe.printStackTrace();
            ioe.getMessage();

        }


    }


    @Test
    public void DatagramServer() throws SocketException, IOException {

        DatagramSocket ds = new DatagramSocket();
        byte[] b = "Today is still in the holiday of Tomb-Sweeping Day!".getBytes();
        DatagramPacket dp = new DatagramPacket(b, 0, b.length, InetAddress.getLocalHost(), 6666);
        ds.send(dp);


    }

    @Test
    public void DatagramClient()throws IOException{

        DatagramSocket ds = new DatagramSocket(6666);
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,0,b.length);
        ds.receive(dp);
        PrintWriter pw = new PrintWriter(new PrintStream(System.out),true);
        pw.println(new String(b));
        pw.write(dp.getLength());
        pw.write(dp.getPort());
        pw.println(dp.getAddress());





    }




}





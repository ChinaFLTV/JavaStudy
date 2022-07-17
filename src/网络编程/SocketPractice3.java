package 网络编程;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/2 上午 8:53
 * *@Description This is a description of SocketPractice3
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class SocketPractice3 {

    public static void main(String[] args) {

        ;

    }


    @Test
    public void client() throws UnknownHostException, IOException {

        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 6677);
        //socket.setSoTimeout(1000);

        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        char[] bufferedArray = new char[1024];
        int readLength = -1;
        int receiveCount = 0;

        bufferedWriter.write("嘿嘿哈嘿！".toCharArray());
        bufferedWriter.flush();
        //socket.shutdownOutput();

/*        byte[] b = new byte[1024];
        InputStream is = socket.getInputStream();*/


       /* System.out.println(is);
        is.read(b);


        System.out.println(new String(b));
        System.out.println("------------is still normal till here------------");

*/
/*
        while ((readLength = is.read(b, 0, b.length)) != -1) {

            receiveCount++;
            System.out.println("Receive in " + receiveCount + " : " + new String(b, 0, readLength));

        }
        socket.shutdownInput();*/


        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        while ((readLength = bufferedReader.read(bufferedArray, 0, bufferedArray.length)) != -1) {

            receiveCount++;
            System.out.println("Receive in " + receiveCount + " : " + new String(bufferedArray, 0, readLength));

        }

        socket.shutdownInput();


        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("近来可好？".toCharArray());
        bufferedWriter.flush();

        //socket.shutdownOutput();

        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while ((readLength = bufferedReader.read(bufferedArray, 0, bufferedArray.length)) != -1) {

            System.out.println("Receive in " + receiveCount + " : " + new String(bufferedArray, 0, bufferedArray.length));

        }
        socket.shutdownInput();


        outputStream.close();
        inputStream.close();
        socket.close();


    }


    @Test
    public void server() throws UnknownHostException, IOException {

        ServerSocket serverSocket = new ServerSocket(6677);
        Socket socket = serverSocket.accept();

        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


        char[] bufferedArray = new char[1024];
        int readLength = -1;
        int receiveCount = 0;

        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while ((readLength = bufferedReader.read(bufferedArray, 0, bufferedArray.length)) != -1) {

            receiveCount++;
            System.out.println("received in " + receiveCount + " : " + new String(bufferedArray, 0, readLength));

        }

        socket.shutdownInput();


        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("我已经收到你的消息啦(^-^)".toCharArray());
        bufferedWriter.flush();
        socket.shutdownOutput();


/*        OutputStream os = socket.getOutputStream();
        os.write("测试".getBytes());
        os.flush();
        socket.shutdownOutput();*/


        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while ((readLength = bufferedReader.read(bufferedArray, 0, bufferedArray.length)) != -1) {

            receiveCount++;
            System.out.println("Receive in " + receiveCount + " : " + new String(bufferedArray, 0, bufferedArray.length));

        }
        socket.shutdownInput();

        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("还好，你呢".toCharArray());
        bufferedWriter.flush();
        socket.shutdownOutput();


        outputStream.close();
        inputStream.close();

        socket.close();
        serverSocket.close();


    }


}

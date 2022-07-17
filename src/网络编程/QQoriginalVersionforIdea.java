package 网络编程;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/1 下午 6:05
 * *@Description This is a description of QQoriginalVersionforIdea
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class QQoriginalVersionforIdea {

    public static void main(String[] args) {

        ;

    }

    @Test
    public void user_server() throws UnknownHostException, IOException {

        ServerSocket serverSocket = new ServerSocket(6661);
        Socket socket = serverSocket.accept();

        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


        char[] inputStream_charArray = new char[1024];

        Scanner scanner_afterRecMsg = new Scanner(System.in);
        String inputText_afterRecMsg = scanner_afterRecMsg.nextLine();
        char[] inputText_afterRecMsg_charArray = new char[1024];

        bufferedWriter.write(inputStream_charArray);
        bufferedWriter.flush();


        while (socket != null) {

            if (inputStream != null) {

                int length = -1;
                while ((length = bufferedReader.read()) != -1) {

                    System.out.println(new String(inputStream_charArray, 0, inputStream_charArray.length));

                }

                Scanner scanner_startCommun = new Scanner(System.in);
                String inputText_startCommun = scanner_afterRecMsg.nextLine();
                char[] inputText_startCommun_charArray = new char[1024];

                bufferedWriter.write(inputStream_charArray);
                bufferedWriter.flush();



            }else{

                Scanner scanner = new Scanner(System.in);
                String inputText = scanner.nextLine();
                char[] inputText_charArray = inputText.toCharArray();

                bufferedWriter.write(inputText_charArray);
                bufferedWriter.flush();





            }



        }


    }


    @Test
    public  void user_client() throws UnknownHostException, IOException {

        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 6661);

        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));



        char[] inputStream_charArray = new char[1024];


        while (socket != null) {

            if (inputStream != null) {

                int length = -1;
                while ((length = bufferedReader.read()) != -1) {

                    System.out.println(new String(inputStream_charArray, 0, inputStream_charArray.length));

                }

                Scanner scanner_afterRecMsg = new Scanner(System.in);
                String inputText_afterRecMsg = scanner_afterRecMsg.nextLine();
                char[] inputText_afterRecMsg_charArray = new char[1024];

                bufferedWriter.write(inputStream_charArray);
                bufferedWriter.flush();



            }else{

                Scanner scanner = new Scanner(System.in);
                String inputText = scanner.nextLine();
                char[] inputText_charArray = inputText.toCharArray();

                bufferedWriter.write(inputText_charArray);
                bufferedWriter.flush();



            }



        }


    }


}

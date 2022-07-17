package IO流;

import java.io.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/24 下午 8:44
 * *@Description This is a description of FileReaderTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class FileReaderTest {


    public static void main(String[] args) {


        try {

            FileWriter fw = new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa"));
            fw.write("heiheiheiheihei");
            char[] c = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

            fw.write(c, 0, c.length);
            fw.close();

            FileInputStream fis = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa"));


            int read = -1;
            int count = 0;
            while ((read = fis.read()) != -1) {

                System.out.println((char) read);
                count++;

            }
            fis.skip(-count);

            byte[] c1 = new byte[8];

            System.out.println("-----------exquisite segment line-------------");
            while ((read = fis.read(c1, 0, c1.length)) != -1) {

                System.out.println(new String(c1, 0, c1.length));
                System.out.println(String.valueOf(c1));


            }

            FileReader fr = new FileReader(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa"));

            System.out.println("-----------------exquisite segment line----------------");

            int count1 = 0;
            while ((read = fr.read()) != -1) {

                System.out.println((char) read);
                count++;

            }

            fr.close();

            FileReader fr1 = new FileReader(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa"));

            char[] b1 = new char[4];

            System.out.println("-----------exquisite    segment    line------------");

            while ((read = fr1.read(b1, 0, b1.length)) != -1) {

                System.out.println(new String(b1, 0, b1.length));

            }


            InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")));

            System.out.println("------------------exquisitSegmentLine-----------------");
            /*while((read = isr.read())!=-1){

                System.out.println((char)read);

            }*/

            char[] b = new char[8];
            while ((read = isr.read(b, 0, b.length)) != -1) {

                System.out.println(new String(b, 0, b.length));

            }


            fr1.close();

            OutputStream os = new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa"));

            os.write(0X88880011);
            os.flush();
            os.close();

            InputStream is = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa"));
            System.out.println(is.read());

            BufferedWriter bos = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\a.aaa"));

            bos.write("hhhhhhhhhhhhhhhhhh");
            bos.flush();
            bos.close();





        } catch (IOException ioe) {

            ioe.getMessage();
            ioe.getLocalizedMessage();
            ioe.printStackTrace();

        }


    }

}

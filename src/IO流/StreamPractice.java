package IO流;

import java.io.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/24 下午 10:21
 * *@Description This is a description of StreamPractice
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class StreamPractice {

    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\img.jpg"));

            byte[] b = new byte[8192 * 8 * 8 * 8];
            is.read(b, 0, b.length);

            File f = new File("C:\\Users\\Lenovo\\Desktop\\img_copy.jpg");
            OutputStream os = new FileOutputStream(f);
            os.write(b, 0, b.length);
            os.flush();
            os.close();


            InputStream is1 = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\video.mp4"));
            byte[] b1 = new byte[1024 * 1024 * 16];

            is1.read(b1, 0, b1.length);

            File f1 = new File("C:\\Users\\Lenovo\\Desktop\\video_copy.mp4");

            OutputStream os1 = new FileOutputStream(f1);

            os1.write(b1, 0, b1.length);
            os1.flush();
            os1.close();

            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Lenovo\\Desktop\\python学习大礼包.txt")));

            char[] c = new char[1024];

            br.read(c, 0, c.length);
            File ff = new File("C:\\Users\\Lenovo\\Desktop\\python学习大礼包.txt");

            File f3 = new File("C:\\Users\\Lenovo\\Desktop\\python学习大礼包_copy1.txt");

            /*Writer w = new FileWriter(f3);

            BufferedWriter bw = new BufferedWriter(w);*/
            if (!f3.exists()) {

                f3.createNewFile();

            }

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(ff));

            byte[] b3 = new byte[1024];

            bis.read(b3, 0, b3.length);

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f3));

            bos.write(b3, 0, b3.length);
            bos.flush();
            bos.close();


            InputStream is2 = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\img_copy.jpg"));


            BufferedReader br2 = new BufferedReader(new FileReader(new File("C:\\Users\\Lenovo\\Desktop\\img_copy.jpg")));
            char[] c3 = new char[1024 * 8 * 8 * 8 * 8];
            byte[] b2 = new byte[1024 * 8 * 8 * 8 * 8];

            br2.read(c3, 0, c3.length);

            BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\img_copy.jpg")));

            for (int i = 0; i < c3.length; i++) {

                c3[i] = (char) ((int) c3[i] ^ 5);

            }


            bw2.write(c3, 0, c3.length);
            bw2.flush();
            bw2.close();

            is2.read(b2, 0, b2.length);

            int read = -1;
            while ((read = is2.read()) != -1) {

                //System.out.print(read);

            }


            for (int k = 0; k < c3.length; k++) {

                c3[k] = (char) ((int) c3[k] ^ 5);

            }

            BufferedWriter bw3 = new BufferedWriter(new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\img_copy.jpg")));

            bw3.write(c3, 0, c3.length);
            bw3.flush();
            bw3.close();


            OutputStream os2 = new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\img_copy.jpg"));
            os2.write(b2, 0, b2.length);
            os2.flush();
            os2.close();


            BufferedReader br3 = new BufferedReader(new FileReader(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")));
            BufferedWriter bw4 = new BufferedWriter(new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")));

            while ((read = br3.read()) != -1) {

                bw4.write(read ^ 5);
                bw4.flush();

            }

            bw4.close();

            BufferedReader br4 = new BufferedReader(new FileReader(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")));
            BufferedWriter bw5 = new BufferedWriter(new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")));

            while ((read = br4.read()) != -1) {

                bw5.write(read ^ 5);
                bw5.flush();

            }

            bw5.close();

            BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")));
            BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")));
            BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\b.bbb")));
            BufferedOutputStream bos3 = new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")));

            byte[] c_backups = new byte[1024];


            bis1.read(c_backups, 0, c_backups.length);

            //bos3.flush();


            byte[] c_destroy = new byte[]{(byte) 23312, (byte) 3541672};

            bos1.write(c_destroy, 0, c_destroy.length);

            bos1.flush();
            bos1.close();

            bos2.write(c_backups, 0, c_backups.length);
            bos2.flush();

            bos3.close();
            bos2.flush();
            bos2.close();
            bis1.close();


            while ((read = bis.read()) != -1) {

                bos.write(read ^ 5);

            }


            bos.close();







            /*bw.write(c, 0, c.length);
            bw.flush();
            bw.close();*/


        } catch (FileNotFoundException fnfe) {

            fnfe.getMessage();
            fnfe.printStackTrace();


        } catch (IOException ioe) {

            ioe.getLocalizedMessage();
            ioe.printStackTrace();

        }

    }


}

package IO流;

import java.io.*;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/25 下午 3:37
 * *@Description This is a description of Transition
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class Transition {

    public static void main(String[] args) {

        try {

            InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")), "UTF-8");
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\b.bbb")), "UTF-8");

            BufferedReader br = new BufferedReader(isr);
            BufferedWriter bw = new BufferedWriter(osw);

            String s = null;
            String read = null;
            while ((read = br.readLine()) != null) {

                bw.write("null");
                bw.newLine();
                bw.flush();

            }

            bw.close();
            br.close();


            BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\a.aaa")), "UTF-8"));
            char[] c = new char[256];
            br1.read(c, 0, c.length);

            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\b.bbb")), "UTF-8"));


            bw1.write(c, 0, c.length);
            bw1.flush();
            bw1.close();


            BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\test.md")), "utf-8"));
            BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\b.bbb")), "Big5"));

            char[] c2 = new char[1024 * 8];

            br2.read(c2, 0, c2.length);

            bw2.write(c2, 0, c2.length);
            bw2.flush();
            bw2.close();
            br2.close();


            Properties p = new Properties();

            p.setProperty("accountName", "LiGuanda");
            p.setProperty("age", "20");
            p.setProperty("address", "Shandong_Mengyin");
            p.setProperty("accountID", "3242742226");
            p.setProperty("accountPassword", "1234567890");

            p.store(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\b.bbb")))), "heihei");

            BufferedReader br3 = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\b.bbb")), "utf-8"));
            BufferedWriter bw3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\c.ccc")), "Shift-JIS"));

            char[] c3 = new char[1024];

            br3.read(c3, 0, c3.length);
            //bw3.write(c3, 0, c3.length);
            bw3.write("能不能给我一首歌的时间");
            bw3.flush();
            br3.close();
            bw3.close();

            /*BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
            while (((read = br4.readLine()) != null) && (read != "")) {

                if ((read.equalsIgnoreCase("e")) || (read.equalsIgnoreCase("exit"))) {

                    break;

                }


                System.err.println(read);


            }*/


            /*Scanner s1 = new Scanner(System.in);

            Object o = s1.next();*/
            //System.out.println(o);

/*
            if(o instanceof Integer){

                System.out.println((Integer)o+"--");

            }
*/
/*            while (true) {


                BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
                if ((read = br4.readLine()).equalsIgnoreCase("exit".toLowerCase(Locale.ROOT))){

                    break;

                }
                System.out.println(read);*/

            BufferedWriter bw4 = new BufferedWriter(new OutputStreamWriter(System.out));
            bw4.write("Could yoy give me a time for a song?");
            bw4.flush();
            //bw4.close();

            BufferedWriter bw5 = new BufferedWriter(new OutputStreamWriter(System.out));
            bw5.append("\nCan you spare me time for a song?", 0, 20);
            bw5.flush();
            bw5.close();


            BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw6 = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedWriter bw7 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\d.ddd"))));

            while (true) {

                if ((read = br6.readLine()).equalsIgnoreCase("exit".toUpperCase(new Locale("zh", "CN")))) {

                    break;

                }

                bw6.write(read);
                bw6.flush();
                bw7.append(read);
                bw7.flush();

            }





            //BufferedReader br4 = new BufferedReader(new InputStreamReader())


        } catch (FileNotFoundException fnfe) {

            fnfe.getMessage();
            fnfe.printStackTrace();

        } catch (UnsupportedEncodingException uee) {

            uee.getLocalizedMessage();
            uee.printStackTrace();

        } catch (IOException ioe) {

            ioe.getMessage();
            ioe.printStackTrace();

        }


    }


    public static String readString() throws IOException {

        BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
        String str = br5.readLine();
        return str;

    }

    public static int readInt() throws IOException {

        return Integer.parseInt(readString());

    }

    public static byte readByte() throws IOException {

        return Byte.parseByte(readString());

    }

    public static Double readDouble() throws IOException {

        return Double.parseDouble(readString());

    }

    public static Long readLong() throws IOException {

        return Long.parseLong(readString());

    }


    public static short readShort() throws IOException {

        return Short.parseShort(readString());

    }

    public static float readFloat() throws IOException {

        return Float.parseFloat(readString());

    }

    public static String readCharacter() throws IOException {

        return readString().substring(0, 1);

    }


}

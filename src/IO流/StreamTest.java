package IO流;


import java.io.*;
import java.util.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/24 上午 9:05
 * *@Description This is a description of StreamTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class StreamTest {

    public static void main(String[] args) {

        try {

            Properties p = new Properties();
            p.setProperty("asset", "precise");
            p.setProperty("jerk", "exposure");
            p.setProperty("tedious", "excursion");
            p.setProperty("exclaim", "architecture");


            File f = new File("C:\\Users\\Lenovo\\Desktop\\hehe\\a\\1234.xyz");
            FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\Desktop\\hehe\\a\\1234.xyz");

            p.store(fw, "heihei");

            FileInputStream fis = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\hehe\\a\\abcdefg.txt"));


            int read = -1;


            //byte[] b = new byte[16];
            while ((read = fis.read()) != -1) {

                System.out.print((char) read);

            }

            fis.close();

            byte[] b = new byte[8];

            int read1 = -1;

            FileInputStream fis1 = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\hehe\\a\\abcdefg.txt"));
            while ((read1 = fis1.read(b)) != -1) {

                System.out.println(new String(b));

            }
            fis1.close();

            fis.close();


            Properties p1 = new Properties();


            FileWriter fw1 = new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\abc.hhhh"));

            fw1.write("heihei,guess what I am ");

            //fw1.close();

            Properties p2 = new Properties();
            p2.setProperty("hei", "heihei");
            p2.setProperty("ha", "haha");
            p2.setProperty("he", "hehe");
            p2.setProperty("xi", "xixi");

            FileWriter fw3 = new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\abc.hhhh"));

            p2.store(fw3, "heihei");

            //fw1.write("ahahahahahahahaha");

            FileWriter fw4 = new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\abc.hhhh"));

            char[] c = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};

            fw4.write(c, 0, 4);
            fw4.close();


            Properties p3 = new Properties();

            p3.put("hei", "heihei");
            p3.put("ha", "haha");
            p3.put("xi", "xixi");
            p3.put("he", "hehe");

            FileWriter fw5 = new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\abc.hhhh"));

            p3.store(fw5, "emmmm");

            Properties p4 = new Properties();


            FileReader fr = new FileReader(new File("C:\\Users\\Lenovo\\Desktop\\abc.hhhh"));

            p4.load(fr);

            Map<String, String> m = new HashMap();

            Set s = p4.entrySet();

            Iterator it = p4.keySet().iterator();
            while (it.hasNext()) {
                Object s1 = it.next();
                String s3 = "heihei";
                Integer i2 = new Integer(999);

                int i3 = i2.intValue();

                System.out.println(s1 + "-----" +p4.getProperty(String.valueOf(s1)));



            }

            Iterator it1 = p4.values().iterator();

            while (it1.hasNext()) {

                System.out.println(it1.next());

            }
            PrintStream ps = new PrintStream(System.err);
            p4.list(ps);
            PrintWriter pw = new PrintWriter(new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\abc.hhhh"  )));

            pw.write("heiheiheiheiheiheihei");

            p4.list(pw);

            System.out.println(p4.propertyNames());




            //System.out.println(p4.getProperty((String) it.next()));




            /*while(it.hasNext()){

                System.out.println(it.next()).getKey());

            }*/


        } catch (FileNotFoundException fnfe) {

            fnfe.getMessage();
            fnfe.printStackTrace();

        } catch (IOException ioe) {

            ioe.getLocalizedMessage();
            ioe.printStackTrace();

        } finally {

            ;

        }


    }


}

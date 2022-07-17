package IO流;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/23 下午 2:53
 * *@Description This is a description of FileTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class FileTest {

    public static void main(String[] args) throws IOException {

        try {

            File f = new File("C:\\Users\\Lenovo\\Desktop\\heihei.heihei");
            File f1 = new File("C:" + File.separator + "hehe" + File.separator + "heihei.hei");
            File f2 = new File("C:/heihei.hei");

            System.out.println(f1.getName());
            System.out.println(f2.getAbsolutePath());

            System.out.println(f1.getAbsolutePath());

            System.out.println(f1.getParent());

            System.out.println(f1.length());

            Properties p = new Properties();

            p.put("jerk", "tune");
            p.put("exposure", "adequate");
            p.put("moreover", "evidently");
            p.put("competent", "adjust");

            /*FileReader fr = new FileReader(f);
            FileWriter fw = new FileWriter(f);
            p.store(fw, "herhe");
*/
            File f3 = new File("C:" + File.separator + "Users" + File.separator + "Lenovo" + File.separator + "Desktop" + File.separator + "heihei.heihei");

            System.out.println(f3.length());
            System.out.println(f3.lastModified());
            Date d = new Date();
            d.setTime(f3.lastModified());
            System.out.println(new SimpleDateFormat().format(d));

            Calendar c = Calendar.getInstance();

            c.setTimeInMillis(f3.lastModified());
            System.out.println(c.get(Calendar.YEAR) + "　" + c.get(Calendar.MONTH) + " " + c.get(Calendar.DAY_OF_MONTH) + c.get(Calendar.HOUR) + " " + c.get(Calendar.MINUTE) + "　" + c.get(Calendar.SECOND));

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            //System.out.println(sdf.parse(((String)(f3.lastModified()))).getTime())

            //System.out.println(new File("C:\\").list());

            //ArrayList<String> a = (ArrayList<String>) Arrays.asList(new File("C:\\").list());
            String[] a = new File("C:").list();
            //Iterator it = a.iterator();

            System.out.println(f.getPath());

            System.out.println(a.getClass().getName() instanceof String);

            f.renameTo(new File("C:\\Users\\Lenovo\\Desktop\\der\\xixi.xi"));

            System.out.println(new File("C:\\Users\\Lenovo\\Desktop\\der\\xixi.xi").exists());

            f.renameTo(new File("C:\\Users\\Lenovo\\Desktop\\hhh.hei"));

            System.out.println(f.length());

            File f5 = new File("C:\\Users\\Lenovo\\Desktop\\hhh.heihei");

            System.out.println(f.renameTo(f5));


            System.out.println(new File("C:\\Users\\Lenovo\\Desktop\\hhh.heihei").exists());

            System.out.println(new File("C:\\Users\\Lenovo\\Desktop\\hhh.hei").exists());


            System.out.println(new File("C:\\Users\\Lenovo\\Desktop\\hhh.hei").canWrite());
            System.out.println(f.canRead());

            System.out.println(f.isHidden());

            System.out.println(f.isFile());

            System.out.println(new File("C:\\Users\\Lenovo\\Desktop").isFile());

            System.out.println(f.isDirectory());

            System.out.println(new File("C:\\Users\\Lenovo\\Desktop").isDirectory());

            System.out.println(new File("C:\\AMD").lastModified());

            Date d1 = new Date();
            d1.setTime(new File("C:\\AMD").lastModified());

            System.out.println(new SimpleDateFormat().format(d1));

            Date d2 = new Date();

            Calendar c1 = Calendar.getInstance();

            //d2.setTimeInMillis(new File())
            c1.setTimeInMillis(new File("C:\\AMD").lastModified());

            System.out.println(c1.get(Calendar.YEAR) + "　" + c1.get(Calendar.MONTH) + " " + c1.get(Calendar.DAY_OF_MONTH));


            new File("C:\\Users\\Lenovo\\Desktop\\abc.se").createNewFile();
            System.out.println(new File("C:\\Users\\Lenovo\\Desktop\\abc.se").exists());

            new File("C:\\Users\\Lenovo\\Desktop\\a\\b\\c\\d\\e\\f\\g").mkdirs();

            System.out.println(new File("C:\\Users\\Lenovo\\Desktop\\hh\\ggggg").mkdir());
            System.out.println(new File("C:\\Users\\Lenovo\\Desktop\\hh").mkdir());

            System.out.println(new File("C:\\Users\\Lenovo\\Desktop\\hh").delete());

            File f4 = new File("C:\\Users\\Lenovo\\Desktop\\hh");

            f4.delete();
            System.out.println(new File("C:\\abc.txt").createNewFile());


            new File("C:\\abc.txt").delete();

            File f6 = new File("C://subjunctive.txt");

            if (!f6.exists()) {

                f6.createNewFile();

            }

            File f7 = new File("C:\\", "sour");
            System.out.println(new File("C:\\sour").exists());
            if (!f7.exists()) {

                f7.mkdir();

            }

            File f8 = new File("C:\\", "hijklmn.txt");
            if (!f8.exists()) {

                f8.createNewFile();

            }

            File f9 = new File("C:\\", "f8/f9");

            System.out.println(new File("C:\\f8/f9").exists());
            if (!f9.exists()) {

                f9.mkdir();

            }



           /* while (it.hasNext()) {

                System.out.println(it.next());

            }
*/

            File f10 = new File("C:\\", "span.txt");
            if (!f10.exists()) {

                f10.createNewFile();

            }

            File f11 = new File("C:\\tune");
            if (!f11.exists()) {

                f11.mkdir();

            } else {

                f11.delete();

            }

            String[] s = new File("C:\\Users\\Lenovo\\Desktop\\hehe").list();

            System.out.println("----------------exquisite segment line---------------");

/*            for (int i = 0; i < s.length; i++) {

                String[] str = ((String) (s[i])).split(".");
                //System.out.println(s[0].substring(s[0].length()-3));
                System.out.println(s[1].substring(s[1].length() - 3, s[1].length()));
                //if (s[i].contains("jpg")) {
                if (s[i].substring(s[i].length() - 3, s[i].length()) == "jpg") {

                    System.out.println(s[i]);

                }*/


            System.out.println("-------------exquisite segment line-------------");


            tune("C:\\Users\\Lenovo\\Desktop\\hehe");
            //


        } finally {

            ;

        }


    }

    public static int count = 1;


    public static void tune(String scratch) {



        String[] s1 = new File(scratch).list();

        if (s1 == null) {

            System.out.println("  ");
        } else {
            for (int i = 0; i < s1.length; i++) {

                if (new File(scratch + "\\" + s1[i]).isDirectory()) {

                    tune(scratch + "\\" + s1[i]);


                } else {

                    String s = "";

                    StringBuffer s2 = new StringBuffer();

                    for (int j = 0; j < count; j++) {

                        s.concat("*");
                        s2.append("*");

                    }
                    System.out.println(scratch + "\\" + s1[i]);

                    //System.out.println(new File(String.valueOf(scratch + s1[i])).length());


                    System.out.println(s2.toString() + s1[i] + "---" + String.valueOf((new File((scratch + "\\" + s1[i])).length())/1024.00/1024.00+"\tMB"));









                }

            }
        }

        count++;

    }


}

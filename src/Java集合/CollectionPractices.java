package Java集合;

import java.io.*;
import java.util.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/18 下午 4:30
 * *@Description This is a description of CollectionPractices
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class CollectionPractices {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        l.add(1);
        l.add(2);
        l.add(2);
        l.add(3);
        l.add(3);

        HashSet<Integer> h = new HashSet<>(l);
        System.out.println(h);
        LinkedList<Integer> l1 = new LinkedList<Integer>(h);
        System.out.println(l1.getFirst());

        //System.out.println(l1);
        for (Integer i : l1) {

            System.out.printf(i + "　");

        }

        System.out.println("------------exquisite segment line------------");
        Map<String, Integer> m = new HashMap();
        m.put("heihei", 0);
        m.put("haha", 1);
        m.put("hehe", 2);
        Map<String, Integer> m1 = new LinkedHashMap<String, Integer>();
        m1.put("enen", 3);
        m1.put("azhe", 4);
        m1.put("yire", 5);
        m.putAll(m1);

        m.remove("heihei");


        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.get("haha"));

        System.out.println(m.containsKey("hehe"));
        System.out.println(m.containsValue(3));
        System.out.println(m.isEmpty());
        System.out.println(m.equals(m1));

        System.out.println(m.keySet());
        System.out.println(m.values());
        //m.clear();
        System.out.println(m.entrySet());
        System.out.println("--------------exquisite segment line-------------");

        //Map<Integer,String> map = new HashMap(Arrays.asList(1,2,3,4,5,6));

        LinkedList<Integer> l3 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Properties p1 = new Properties();
        p1.setProperty("id0", "hehe");
        p1.setProperty("id1", "heihei");
        p1.setProperty("id2", "haha");
        p1.setProperty("id3", "hetui");

        Properties p2 = new Properties(p1);
        System.out.println(p2.getProperty("id0"));
        System.out.println(p2.getProperty("id4"));

        try {

            FileReader f = new FileReader("src/Java集合/properties.properites");
            Properties p3 = new Properties();
            p3.load(f);
            System.out.println(p3.getProperty("username"));
            System.out.println(p3.getProperty("password"));


            FileReader f1 = new FileReader("C:\\Users\\Lenovo\\Desktop\\object.txt");
            Properties p4 = new Properties();
            p4.load(f1);
            System.out.println(p4.getProperty("emmm"));
            System.out.println(p4.getProperty("hehehe"));
            System.out.println(p4.getProperty("id5","404 not found"));

            Properties p5 = System.getProperties();
            Set set = p5.entrySet();
            System.out.println(set);
            Iterator i = set.iterator();
            while(i.hasNext()){

                Map.Entry me = (Map.Entry)i.next();
                System.out.println(me.getKey()+"\t\t"+me.getValue());

            }

            System.out.println("--------------exquisite seegment line--------------");
            Properties p6 = new Properties(p5);

            p6.setProperty("name","gebilaji");
            p6.setProperty("number","666666");
            p6.setProperty("password","heiheishazi");
            p6.setProperty("address","China");

            p6.store(new FileWriter("C:\\Users\\Lenovo\\Desktop\\hehehe.xyz"),"description of this property");


            Properties p7 = new Properties();
            p7.setProperty("hehehe","111");
            p7.setProperty("heiheihei","222");
            p7.store(new FileWriter("C:\\Users\\Lenovo\\Desktop\\_O_O_.hetui"),"xixi");

            PrintWriter pw = new PrintWriter(System.out);
            p7.list(pw);
            pw.flush();

            Properties p8 = new Properties();
            p8.setProperty("wife","JuJingyi");
            p8.setProperty("Husband","me");
            p8.setProperty("MarryDate","today");
            p8.setProperty("address","China");

            PrintWriter pw1 = new PrintWriter(System.out);
            p8.list(pw1);
            pw1.flush();

            Properties p9 = new Properties();
            p9.setProperty("heihei","nbplus");
            p9.setProperty("hetui","nbpro");
            p9.setProperty("hehe","nbpro+");
            p9.setProperty("haha","promax");

            p9.store(new FileWriter("C:\\Users\\Lenovo\\Desktop\\heihei.hei"),"heiheihei");

            Properties p10 = new Properties();
            p10.load(new FileReader("C:\\Users\\Lenovo\\Desktop\\heihei.hei"));
            for(Map.Entry s:p10.entrySet()){

                System.out.println(s.getKey()+"\t\t"+s.getValue());


            }
            System.out.println(p10.stringPropertyNames());
            p10.replace("hehe","nbpro+","nbpro++");
            System.out.println(p10.getOrDefault("hehe","404notFound"));

            System.out.println(p10.values());



        }catch(FileNotFoundException fnfe){

            fnfe.printStackTrace();
            fnfe.getLocalizedMessage();
            fnfe.getMessage();

        }catch(IOException ioe){

         ioe.printStackTrace();
         ioe.getLocalizedMessage();
         ioe.getCause();
         ioe.getMessage();

        }finally{

            ;

        }


    }


}



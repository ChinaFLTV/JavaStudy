package Java集合;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/27 下午 10:14
 * *@Description This is a description of WordCount
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class WordCount {


    public static void main(String[] args) {

        try {


            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\Hongloumeng.txt"))));
            //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\WordCount_1.0.txt"))));
            StringBuffer sb = new StringBuffer();
            RandomAccessFile raf = new RandomAccessFile(new File("C:\\Users\\Lenovo\\Desktop\\WordCount.txt"), "rws");


            Map<Character, Integer> m = new HashMap<Character, Integer>();
            char[] read = new char[1];
            int flag = -1;
            while ((flag = br.read(read, 0, read.length)) != -1) {

                if (m.get(read[0]) == null) {

                    m.put(read[0], 1);

                } else {

                    m.replace(read[0], m.get(read[0]) + 1);

                }

            }

            //Map.Entry<Character, Integer> me = (Map.Entry<Character, Integer>) m.entrySet();

/*            char currentKey;
            int currentValue;
            while (new Integer(currentValue = me.getValue()) != null) {

                currentKey = me.getKey()


                raf.writeUTF();


            }*/

            int statisticsCount = 0;
            for (Map.Entry<Character, Integer> entry : m.entrySet()) {

                statisticsCount++;
                raf.writeUTF(statisticsCount + "\t\t" + entry.getKey() + ":\t\t" + entry.getValue()+"\n");

            }


        } catch (FileNotFoundException fnfe) {

            fnfe.getMessage();
            fnfe.printStackTrace();

        } catch (IOException ioe) {

            ioe.getLocalizedMessage();
            ioe.printStackTrace();

        }


    }


}

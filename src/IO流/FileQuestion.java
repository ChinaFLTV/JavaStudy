package IO流;

import java.io.File;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/23 下午 10:43
 * *@Description This is a description of FileQuestion
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class FileQuestion {

    public static void main(String[] args) {

        String[] s = new File("C:\\Users\\Lenovo\\Desktop\\hehe").list();
        for (int i = 0; i <s.length; i++) {

            //System.out.println(s[i]);

            if(s[i].substring(s[i].length()-3,s[i].length())=="jpg"){

                System.out.println("jpg");

            }



        }

    }


}

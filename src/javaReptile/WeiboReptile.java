package javaReptile;

import org.jsoup.Jsoup;

import javax.swing.text.Document;
import java.io.IOException;

/**
**@Author LiGuanda
**@Data 2022/3/19 下午 7:49
**@Description This is a description of WeiboReptile
**@Params
**@Return
**@Since versio-1.0  */



public class WeiboReptile {

    public static void main(String[] args){

        try {

            String url = "https://weibo.com/u/3669102477";
            Document doc = (Document)Jsoup.connect(url).get();

            System.out.println(doc);

        }catch(IOException ioe){



        }


    }



}



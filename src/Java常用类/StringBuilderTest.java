package Java常用类;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/19 上午 10:34
 * *@Description This is a description of StringBuilderTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("I love Math!");
        sb.delete(2, 6);
        sb.insert(2, "hate");
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
        sb.reverse();
        System.out.println(sb.indexOf("Ma"));
        System.out.println(sb.charAt(2));
        sb.setCharAt(1, '*');
        System.out.println(sb.toString());
        System.out.println(sb.length());

        StringBuffer sb1 = new StringBuffer();


        String str = null;
        StringBuffer sb2 = new StringBuffer();
        sb2.append(str);
        System.out.println(sb2 + "\t\t" + sb2.length());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        System.out.println(sb3 + "\t\t" + sb3.length());

        System.out.println("----------exquisite segment line----------------");
        //System.out.println(new String("content").getBytes().getLength());


    }


}

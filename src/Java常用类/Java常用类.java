package Java常用类;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/19 上午 8:51
 * *@Description This is a description of Java常用类
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class Java常用类 {

    public static void main(String[] args) {

        String s = "miraculous";
        String s1 = "miraculous";
        String s2 = new String("miraculous");
        String s3 = new String("miraculous");
        char[] c = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        System.out.println(s == s1);
        System.out.println(new String(s1));
        System.out.println(new String(c, 0, 3));
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        Person2 p = new Person2("Taylor Swift");
        Person2 p1 = new Person2("Alan Walker");
        Person2 p2 = new Person2("Taylor Swift");

        System.out.println(p == p2);
        System.out.println((p.name).equals(p2.name));
        System.out.println((p.name).equals("Taylor Swift"));
        System.out.println(s.intern());

        String s4 = "0";
        for (int i = 1; i < 5; i++) {

            s4 += i;

        }

        System.out.println(s4);

        String s5 = new String("0");
        for (int i = 1; i < 5; i++) {

            s5 += i;

        }
        System.out.println(s5);
        System.out.println("----------------exquisite segment line---------------");

        String s6 = new String("good");
        char[] c1 = new char[]{'t', 'e', 's', 't'};
        Java常用类.change(s6, c1);
        System.out.println("String : " + s6 + "\t\tcharArray : " + c1[0]);


    }


    public static void change(String str, char[] c) {

        str = "test ok";
        c = new char[]{'0', '1', '2', '3'};

    }

    @Test
    public void StringMethodTest() throws UnsupportedEncodingException {

        System.out.println("abc".length());
        System.out.println("Heiha".charAt(0));
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("abcd".toUpperCase());
        System.out.println("ABCD".toLowerCase());
        System.out.println("abCD".toUpperCase().toLowerCase());
        System.out.println("acBD".equalsIgnoreCase("ACbd"));
        System.out.println(" abc ".trim().length());
        System.out.println(" hetui".trim().toUpperCase());
        System.out.println("ab".concat("cd"));
        System.out.println(("abc".concat("efg")).toUpperCase());
        System.out.println("ab".compareTo("AB"));
        System.out.println("ab".compareTo("ABCDEFGHIJKLMN"));
        System.out.println("abcdefg".substring(0, 3));
        System.out.println("abcdefg".startsWith("a"));
        System.out.println("abcdefg".startsWith("ae"));

        System.out.println("abcdefg".startsWith("ab", 0));
        System.out.println("abcdefg".startsWith("de", 3));
        System.out.println("abcd".endsWith("cd"));
        System.out.println("abcabc".indexOf("abc"));
        System.out.println("abcabc".lastIndexOf("abc"));
        System.out.println("abcabcabc".indexOf("abc", 3));
        System.out.println("aaaa".replace('a', 'b'));
        System.out.println("abcabc".getBytes("UTF-8"));
        System.out.println("abcd".getBytes("UTF-8").length);


    }


    @Test
    public void FakeTrim() {

        String s = "   abcd ";

        char[] c = s.toCharArray();
/*        System.out.println(Stream.of(c).filter((x) -> {

            for (int i = 0; i < x.length; i++) {

                return x[i] != 32;

            }
        }).)*/
       /* List<char[]> a = Arrays.asList(c);
        Iterator i = a.iterator();
        while (i.hasNext()) {

            char ch = '\0';
            if ((ch = (char) (i.next())) == 32) {

                a.remove(ch);

            }
        }
        Object[] c2 = a.toArray();
        System.out.println(new String(String.valueOf(a.toArray())));
*/
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<c.length;i++){

            if(c[i] != 32){

                sb.append(c[i]);

            }
        }

        System.out.println(sb.toString());


    }


    public static String Reverse(String s){

        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for(int i = c.length-1;i>=0;i--){

            sb.append(c[i]);

        }

        return sb.toString();

    }


    public static String Reverse(String s,int startIndex,int endIndex){

        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for(int i = endIndex;i>=startIndex;i--){

            sb.append(c[i]);

        }

        return sb.toString();

    }


    @Test
    public void FakeReverse(){

        String s = "abgfedc";

        String s1 = Java常用类.Reverse(s,2,s.length()-1);
        String s2 = s.substring(0,2);
        StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.append(s1);
        System.out.println(sb.toString());



    }


}

class Person2 {

    public String name;

    public Person2(String name) {

        this.name = name;

    }

}






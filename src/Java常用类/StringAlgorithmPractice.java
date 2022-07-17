package Java常用类;

import org.junit.Test;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/19 下午 5:57
 * *@Description This is a description of StringAlgorithmPractice
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class StringAlgorithmPractice {


    public static void main(String[] args) {

        String s1 = "abkkcadkabkebfkabkskab";
        System.out.println(s1.indexOf("ab", 0));

    }


    @Test
    public void SearchSubstring() {

        String s = "abkkcadkabkebfkabkskab";
        int count = 0;
        int start = 0;
        int index = 01;
        while (start < s.length()) {

            if ((index = s.indexOf("ab", start)) != -1) {

                count++;
                start = index + 1;

            } else {

                break;

            }

        }
        System.out.println(count);


    }

    @Test
    public void MaxCommonSubstring() {

        String s1 = "abcwerthelloyuiodef";
        String s2 = "cvhellobnmyuiodef";

        int start = 0;
        //int increment = s2.length();
        //boolean flag = false;
        for (int i = s2.length(); i > 0; i--) {

            while ((start + i) <= s2.length()) {

                if (s1.indexOf(s2.substring(start, start + i), 0) != -1) {

                    System.out.println(s2.substring(start, start + i));
                    return;

                }
                start++;


            }
            start = 0;


        }




        /*while (left <= right) {

            if (flag) {


                if (s1.indexOf(s2.substring(left, right), 0) != -1) {

                    System.out.println(s2.substring(left, right));
                    return ;

                }
                left++;


            } else {

                if (s1.indexOf(s2.substring(left, right), 0) != -1) {

                    System.out.println(s2.substring(left, right));
                    return ;

                }
                right--;

            }


        }*/


    }

    @Test
    public void StringSort() {

        String s = "abkkcadkabkebfkabkskab";
        char[] c = s.toCharArray();
        char max = c[0];


        for (int i = 0; i < c.length; i++) {

            for (int j = 1; j < c.length - i; j++) {

                if (c[j - 1] > c[j]) {

                    char temp = c[j - 1];
                    c[j - 1] = c[j];
                    c[j] = temp;

                }

            }

            //c[c.length - 1 - i] = max;

        }
        System.out.println(new String(c));


    }

    public static void AdditionalSort(char c1, char c2) {

        if (c1 > c2) {


        }

    }


}

class KeepClose {


}

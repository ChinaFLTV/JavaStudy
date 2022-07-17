package 面向对象_中;


import java.util.Scanner;
import java.util.Vector;

public class Wrapper {

    public static void main(String[] args) {

        int i = 5;
        Integer I = new Integer(i);
        Long L = new Long(666L);
        Long L_1 = new Long(123L);
        Float F = new Float("6.000F");
        Character C = new Character('a');
        Character C_1 = new Character('c');
        Boolean B = new Boolean("True");
        Boolean B_1 = new Boolean("TrUe");
        System.out.println(B_1);


        double d = Double.parseDouble("6.6666");
        int i_1 = Integer.parseInt("45");
        boolean b = Boolean.parseBoolean("TrUE");
        //long l = Long.parseLong("666L",3);
        //char c = Character.
        float f = Float.parseFloat("4.666F");
        int i_2 = Integer.valueOf("566");
        double d_1 = Double.valueOf("6.666");
        long l_1 = Long.valueOf(6666L);
        boolean b_1 = Boolean.valueOf("TrUE");
        System.out.println(b_1);

        System.out.println("-------------exquisite segment line----------------");

        Object o_1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o_1);
        Object o_2;

        if (true) {

            o_2 = new Integer(1);

        } else {

            o_2 = new Double(2.0);

        }

        System.out.println(o_2);

        Integer I_1 = new Integer(1);
        Integer I_2 = new Integer(1);

        System.out.println(I_1 == I_2);

        Integer I_3 = 1;
        Integer I_4 = 1;

        System.out.println(I_3 == I_4);

        Integer I_5 = 128;
        Integer I_6 = 128;

        System.out.println(I_5 == I_6);

        Integer I_7 = new Integer(1);

        System.out.println(I_7.toString());

        Integer I_8 = new Integer("566");

        String s = String.valueOf(564);

        Integer I_9 = Integer.valueOf("56");

        boolean b_2 = Boolean.parseBoolean("false");

        float f_1 = Float.parseFloat("6.666");

        Integer I_10 = new Integer(100);
        int i_3 = I_10.intValue();
        Boolean b_3 = new Boolean(true);
        boolean b_4 = b_3.booleanValue();
        System.out.println(b_4);

        System.out.println("--------------exquisite segment line----------------------------");

        Vector v = new Vector();
        //Scores s_1 = new Scores();
        System.out.println("Please input students' scores: ");
        Scanner input = new Scanner(System.in);
        //double score = input.nextDouble();
        while (true) {

            double score = input.nextDouble();
            if (score < 0) {

                break;

            }


            Double d_2 = new Double(score);
            System.out.println("Please input...");

            v.addElement(d_2);


        }

        double max = 0;

        for (int k = 0; k < v.size(); k++) {

            if (((Double) (v.elementAt(k))).doubleValue() > max) {

                max = ((Double) (v.elementAt(k))).doubleValue();

            }

        }

        System.out.println("The highest score is: " + max);
        for (int m = 0; m < v.size(); m++) {

            if ((max - ((Double) (v.elementAt(m)))) <= 10) {

                System.out.println("The current student's score is " + ((Double) (v.elementAt(m))).doubleValue() + "\t\tGrade: A");

            } else if ((max - ((Double) (v.elementAt(m)))) <= 20) {

                System.out.println("The current student's score is " + ((Double) (v.elementAt(m))).doubleValue() + "\t\tGrade: B");

            } else if ((max - ((Double) (v.elementAt(m)))) <= 30) {

                System.out.println("The current student's score is " + ((Double) (v.elementAt(m))).doubleValue() + "\t\tGrade: C");

            } else {

                System.out.println("The current student's score is " + ((Double) (v.elementAt(m))).doubleValue() + "\t\tGrade: D");

            }
        }


    }

}



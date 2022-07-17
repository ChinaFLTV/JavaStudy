package 面向对象_下;


import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Calendar.*;

public class SalarySystem {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "达哥";
        char[] cs = str.toCharArray();
      /*  for (int j = 0; j < cs.length; j++) {

            String s = cs[j] + "";
            System.out.print(PayrollEmployee.bytes2HexString(s));
            System.out.print(" ");
            for (int i = 0; i < 4; i++) {

                System.out.print(PayrollEmployee.getRandomCharacter(3));
                System.out.print(" ");

            }
        }
*/
        System.out.println("---------------exquisite segment line--------------");

        PayrollEmployee.downLead();

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
        System.out.println(Calendar.getInstance().get(Calendar.DATE));
        System.out.println(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
        System.out.println(Calendar.getInstance().get(Calendar.MINUTE));
        System.out.println(Calendar.getInstance().get(Calendar.SECOND));
        System.out.println(Calendar.getInstance().get(DAY_OF_WEEK));
        System.out.println(Calendar.getInstance().get(DAY_OF_MONTH));
        System.out.println(Calendar.getInstance().get(DAY_OF_YEAR));

        System.out.println("-----------------exquisite segment line------------------");
        //PayrollEmployee pe = new PayrollEmployee();


    }


}

abstract class Employee_1 {

    public final String name;
    public final long number;
    public final MyDate_1 birthday;

    public Employee_1(String name, long number, MyDate_1 birthday) {

        this.name = name;
        this.number = number;
        this.birthday = birthday;

    }

    public String getName() {

        return this.name;

    }

    public long getNumber() {

        return this.number;

    }

    public String getBirthday() {

        return this.birthday.toString();

    }

    public abstract double earnings();

}

class MyDate_1 {

    private int year;
    private int month;
    private int day;

    public MyDate_1() {

        ;

    }

    public MyDate_1(int year, int month, int day) {

        this();
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public int getYear() {

        return this.year;

    }

    public int getMonth() {

        return this.month;

    }

    public int getDay() {

        return this.day;

    }

    public String toString() {

        if (Calendar.getInstance().get(Calendar.MONTH) == this.month) {


            return this.year + "-" + this.month + "-" + this.day;

        } else {

            return this.year + "-" + this.month + "-" + this.day;

        }
    }

}

class SalariedEmployee extends Employee_1 {


    private static double monthlySalary;

    protected MyDate_1 md;

    {

        SalariedEmployee.monthlySalary = 8000;

    }

    public static double getSalary() {

        return SalariedEmployee.monthlySalary;

    }

    public SalariedEmployee(String name, long number, MyDate_1 md) {

        super(name, number, md);
        this.md = md;

    }


    public double earnings() {

        return monthlySalary;

    }

    public String toString() {

        if ((Calendar.getInstance().get(Calendar.MONTH) + 1) == this.md.getMonth()) {

            return "name: " + super.getName() + "\t\tnumber: " + this.getNumber() + "\t\tbirthday: " + super.getBirthday() + "\t\tsalary: " + SalariedEmployee.getSalary();

        } else {

            return "name: " + super.getName() + "\t\tnumber: " + this.getNumber() + "\t\tbirthday: " + super.getBirthday();

        }

    }


}

class HourlyEmployee extends Employee_1 {

    private static double wage;
    private static double hour;

    {

        HourlyEmployee.wage = 12000;
        HourlyEmployee.hour = 10;

    }

    public HourlyEmployee(String name, long number, MyDate_1 md) {

        super(name, number, md);

    }

    public double earnings() {

        return HourlyEmployee.wage * HourlyEmployee.hour;

    }

    public String toString() {

        if ((Calendar.getInstance().get(Calendar.MONTH)) == HourlyEmployee.getSalary()) {

            return "name: " + super.getName() + "\t\tnumber: " + super.getNumber() + "\t\tbirthday: " + super.getBirthday() + "\t\tsalary: " + HourlyEmployee.getSalary();

        } else {

            return "name: " + super.getName() + "\t\tnumber: " + super.getNumber() + "\t\tbirthday: " + super.getBirthday();

        }
    }

    public static double getSalary() {

        return HourlyEmployee.wage * HourlyEmployee.hour;

    }

}

class PayrollEmployee {

    private static Employee_1[] employeeArray = new Employee_1[10];

    public static void downLead() {

        ;

    }

    static {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {

            try {

                Employee_1 e = new SalariedEmployee(PayrollEmployee.getRandomCharacter(3), (int) ((ThreadLocalRandom.current().nextDouble()) * 1000000000), new MyDate_1(1983, random.nextInt(12), random.nextInt(31)));
                employeeArray[i] = e;

            } catch (UnsupportedEncodingException e) {

                e.printStackTrace();

            }
        }

        for (int i = 5; i < 10; i++) {

            try {

                Employee_1 e = new HourlyEmployee(PayrollEmployee.getRandomCharacter(3), (int) ((ThreadLocalRandom.current().nextDouble()) * 1000000000), new MyDate_1(1983, random.nextInt(12), random.nextInt(31)));
                employeeArray[i] = e;

            } catch (UnsupportedEncodingException e) {

                e.printStackTrace();

            }

        }

        for (int k = 0; k < employeeArray.length; k++) {

            System.out.println(employeeArray[k].toString());

        }
    }

    /*public static String bytes2HexString(String s) {

        byte[] b = s.getBytes();
        s = "";
        for (int j = 0; j < b.length; j++) {

            String hex = Integer.toHexString(b[j] & 0xff);
            if (hex.length() == 1) {

                hex = hex + '0';

            }

            s = s + hex.toUpperCase();

        }

        return s;

    }
*/

    public static String bytes2HexString(String s) {

        byte[] b = s.getBytes();
        s = "";
        for (int j = 0; j < b.length; j++) {

            String hex = Integer.toHexString(b[j] & 0xff);

            if (hex.length() == 1) {

                hex = hex + '0';

            }

            s = s + hex.toUpperCase();

        }
        return s;
    }

/*    public static String getRandomCharacter() throws UnsupportedEncodingException {

        String str = "";
        int highCode;
        int lowCode;

        Random random = new Random();

        highCode = (176 + Math.abs(random.nextInt(39)));
        lowCode = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(highCode)).byteValue();
        b[1] = (Integer.valueOf(lowCode)).byteValue();

        str = new String(b, "GBK");
        return str;

    }*/

    public static String getRandomCharacter(int times) throws UnsupportedEncodingException {

        String str = "";
        int highCode;
        int lowCode;

        for (int i = 0; i < times; i++) {


            Random random = new Random();
            highCode = (176 + Math.abs(random.nextInt(39)));
            lowCode = (161 + Math.abs(random.nextInt(93)));

            byte[] b = new byte[2];

            b[0] = (Integer.valueOf(highCode)).byteValue();
            b[1] = (Integer.valueOf(lowCode)).byteValue();

            str += new String(b, "gbk");

        }

        return str;

    }

}





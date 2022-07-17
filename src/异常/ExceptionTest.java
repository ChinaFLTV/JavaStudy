package 异常;


import java.io.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ExceptionTest {

    public int x;

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String[] friends = new String[]{"lisa", "bily", "kessy"};

/*        try{

            for(int i = 0;i<5;i++){

                System.out.println(friends[i]);

            }

        }catch(RuntimeException re){

            System.out.println("indexOfBoundsException");
            re.getMessage();
            re.printStackTrace();

        }finally{

            System.out.println("Heihei");

        }*/


        System.out.println("HEHE");

        System.out.println("-------------exquisite segment line------------");


  /*      FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\test.txt");

        int b;
        b = fis.read();
        while (b != -1) {

            System.out.println((char) b);
            b = fis.read();

        }
        fis.close();*/

        System.out.println("--------------exquisite segment line------------");

        FileInputStream fis2 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\test.txt");

        int re = fis2.read();
        byte[] bytes = new byte[10];
        while (re != -1) {

            //byte[] bytes = new byte[10];
            //fis2.read(bytes,3,6);
            //System.out.print(new String(bytes));
            //System.out.print(re);
            re = fis2.read(bytes,0,10);
            for(int i = 0;i<bytes.length;i++){

                System.out.print((char)bytes[i]+" ");

            }
            System.out.println("");





        }
        System.err.println("error");

        new ExceptionTest().test();















/*        try {
            fis.close();

            File file = new File("C:\\Users\\Lenovo\\Desktop\\test1.txt");

            FileOutputStream fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);

*//*
            for (int i = 0; i < 9999; i++) {

                for (int j = 1; j < 100; j++) {

                    ps.print(j + " ");

                }

                ps.println("");


            }
*//*


            ps.close();

        } catch (Throwable a) {

            System.out.println(a.getLocalizedMessage());

        } finally {

            System.out.println("finally");

*//*            FileInputStream fis1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\test.txt");

            int read = fis1.read();
            while (read != -1) {
                byte[] bytes = new byte[10];

                System.out.print((char)(read)+"　");
                fis1.read(bytes,0,8);
                System.out.println("");

            }

            fis1.close();*//*


        }*/












        /*
        try{

            ExceptionTest et = new ExceptionTest();

            //int y = 3/et.x;
            MyExceptionGenerator mg = new MyExceptionGenerator();
            mg.generateException();

        }catch (MyException ae){

            System.out.println("ArithmeticException");
            System.out.println(ae.getMessage());
            System.out.println(ae.getStackTrace());
            System.out.println(ae.getCause());
            System.out.println(ae.getLocalizedMessage());

        }finally{

            System.out.println("finally");

        }*/

        System.out.println("----------------exquisite segment line---------------");

        try {

            ExceptionTest et = new ExceptionTest();

            int num = 666 / et.x;

        } catch (ArithmeticException ae) {

            System.out.println(ae.getMessage());
            System.out.println(ae.getLocalizedMessage());
            System.out.println(ae.getCause());
            System.out.println(ae.getStackTrace());
            //System.out.println(ae.getSuppressedMessage());

        } finally {

            System.out.println("Finally");

        }


    }

    public void test()throws FileNotFoundException,IOException{


        FileInputStream input = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\test.txt");
        int read;
        while((read = input.read())!=-1){

            System.out.println((char)(read));

        }

        input.close();


    }

}

class MyException extends Throwable {

    //ResourceBundle rb = ResourceBundle.getBundle("loc.exc.test.message");
    public static final long serivalVersionUID = 1L;

    public MyException(String key) {

        super(key);

    }

    public  static void test1()throws FileNotFoundException{



            FileInputStream input = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\test.txt");


            Scanner scan = new Scanner(System.in);
            if(scan.nextDouble()==-456){

                IllegalArgumentException iae = new IllegalArgumentException();
                throw iae;

            }

            try{

                int num = 6666/0;

            }catch(Exception e){

                System.err.println("error");
                throw new ArithmeticException();
                //System.err.println(e);

            }




    }

/*    public String getLocalizedMessage(){

        return rb.getString(getMessage());

    }*/
}

class MyExceptionGenerator {

    public void generateException() throws MyException {

        throw new MyException("Key");

    }
}


class MyException1 extends Exception{

    static final long serivalVersionUID = 13456789L;
    private int idnumber;

    public MyException1(String message,int id){

        super(message);
        this.idnumber = id;

    }

    public int getId(){

        return this.idnumber;

    }


}






package 异常;


public class ExceptionQuestion {

    public static void main(String[] args) {

        try {

            System.out.println(test(3,5));
            func();
            System.out.println("A");

        } catch (Exception e) {

            System.out.println("C");

        } finally {

            System.out.println("D");

        }

    }

    public static void func() {

        try {

            throw new Exception();

        } catch (Exception e) {

            //e.printStackTrace();

        } finally {

            System.out.println("B");

        }

    }


    public static int test(int num1, int num2) {

        int num;

        try {
            num = num1 + num2;
            return num;

        }catch(Exception e){

            ;

        }finally{

            num = num1-num2;

        }
        return -1;

    }
}

class Exc0 extends Exception {

    public static void fakeMehtod() {

        ;

    }

    ;

}

/*
class Exc1 extends Exc0{

    public static void fakeMethod(int fakeIndex){

        ;

    };

}
*/

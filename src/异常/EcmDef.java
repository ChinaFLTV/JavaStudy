package 异常;


public class EcmDef {

    public static void main(String[] args) {

/*        for (int i = 0; i < args.length; i++) {

            System.out.println(args[i]);

        }*/
        //int i =0;

        try {

            //int divideNum = args[0] / args[1];
            System.out.println("The result of dividing two numbers is: " + divide(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

        } catch (NumberFormatException nfe) {

            System.out.println(nfe.getMessage());


        } catch (ArrayIndexOutOfBoundsException aioobe) {

            System.out.println(aioobe.getLocalizedMessage());

        } catch (MyArithmeticException mae) {

            System.out.println(mae.getMessage());

        } catch (ArithmeticException ae) {

            System.out.println(ae.getMessage());
            System.out.println(ae.getCause());

        } finally {

            System.out.println("Appliacation operation end!");

        }


    }

    public static double divide(Object num1, Object num2) {

        if ((num1 instanceof Integer) && (num2 instanceof Integer)) {


            if ((num1 == null) && (num2 == null)) {

                throw new ArrayIndexOutOfBoundsException("No enough data to divide.");

            } else {

                if ((int) num2 == 0) {

                    throw new ArithmeticException("The divisor is 0.");


                } else {

                    if (((int) num1 < 0) || (int) num2 < 0) {

                        throw new MyArithmeticException("Not all of nums are positive number.", 1);

                    } else {

                        return (int) num1 / (int) num2;

                    }

                }

            }

        } else {

            throw new NumberFormatException("Not all the datatype are int.");

        }

    }

}

class MyArithmeticException extends ArithmeticException {

    static final long serialVersionUID = 12345678912L;
    private int ExceptionType;

    public MyArithmeticException(String message, int type) {

        super(message);
        this.ExceptionType = type;

    }

    public String getMessage() {

        return "Custom Exception Tips: " + super.getMessage();

    }

    public int getType() {

        return this.ExceptionType;

    }

}



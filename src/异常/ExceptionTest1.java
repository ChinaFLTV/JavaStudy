package 异常;


import java.io.*;

public class ExceptionTest1 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        File f = new File("C:\\Users\\Lenovo\\Desktop\\object.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        TestObject to = new TestObject("IU", 25, "Korea", "111111111@gmail.com", "cs");
        oos.writeObject(to);

        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\object.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object to1 = ois.readObject();
        ois.close();
        System.out.println(((TestObject) to1).getUpdateContent());

        System.out.println("--------------exquisite segment line-------------");

        ExceptionTest1 e1 = new ExceptionTest1();
        e1.manager();

        System.out.println("----------------exquisite segment line---------------");

        ExceptionTest1 e2 = new ExceptionTest1();
        try {

            e2.methodA();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            e2.methodB();

        }

    }

    public void regist(int num) throws MyException2 {

        if (num < 0) {

            throw new MyException2("The number of people is negative number.", 3);

        } else {

            System.out.println("The number of register is: " + num);

        }

    }

    public void manager() {

        try {

            regist(-9);

        } catch (MyException2 me2) {

            System.out.println(me2.getMessage());
            System.out.println("Fail Register! ->The type of error is: " + me2.getId());

        } finally {

            System.out.println("Register Completed!");

        }


    }

    public void methodA() {

        try {

            System.out.println("Go into mathodA.");
            throw new RuntimeException("Create Exception");

        } finally {

            System.out.println("Go into FinallyBlock of methodA.");

        }

    }

    public void methodB() {

        try {

            System.out.println("Go into methodB.");

        } finally {

            System.out.println("Go into FinallyBlock of methodB.");

        }

    }


}


class TestObject implements Serializable {

    private static final long serialVersionUID = 12345678910L;

    private String name;
    private int age;
    private String address;
    private String email;
    private String updateContent;

    public TestObject() {

        ;

    }

    public TestObject(String name, int age) {

        this();
        this.name = name;
        this.age = age;

    }

    public TestObject(String name, int age, String address, String email, String updateContent) {

        this(name, age);
        this.address = address;
        this.email = email;
        this.updateContent = updateContent;

    }

    public String getName() {

        return this.name;

    }

    public int getAge() {

        return this.age;

    }

    public String getAddress() {

        return this.address;

    }

    public String getEmail() {

        return this.email;

    }

    public String getUpdateContent() {

        return this.updateContent;

    }

    public long getSerialVersionUID() {

        return this.serialVersionUID;

    }


}

class MyException2 extends Exception {

    static final long serialVersionUID = 12345678911L;
    private int idnumber;

    public MyException2(String message, int id) {

        super(message);
        this.idnumber = id;

    }

    public int getId() {

        return this.idnumber;

    }

}





package 面向对象_下;

public class Singleton {

    public static void main(String[] args) {

        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {


            System.out.println("args[" + i + "]: " + args[i]);

        }
        System.out.println("Aplication program is operating");

        System.out.println("--------------exquisite segment line-------------");

        //System.out.println("num= " + CodeBlock.num);
        System.out.println("Not invoke CodeBlock class.");


        CodeBlock cb = new CodeBlock();

        //CodeBlock cb_1 = new CodeBlock();


    }

}

class Singleton_theHungry {

    private Singleton_theHungry() {

        ;

    }

    public static Singleton_theHungry sth = new Singleton_theHungry();

    public static Singleton_theHungry getInstance() {

        return sth;


    }


}

class Singleton_idler {

    private Singleton_idler() {

        ;

    }

    public static Singleton_idler si;

    public static Singleton_idler getInstance() {

        if (si == null) {

            si = new Singleton_idler();
            return si;

        } else {

            return si;

        }
    }
}


class CodeBlock {

    public static int num;

    public String name = "Dage";

    {

        System.out.println("CodeBlock was operating.");

    }

    public CodeBlock() {

        System.out.println("Constructor was invoked.");

    }

    static {

        num = 100;
        System.out.println("StaticCodeBlock was operating.");

    }


}

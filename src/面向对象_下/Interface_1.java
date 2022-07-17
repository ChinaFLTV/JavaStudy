package 面向对象_下;


public class Interface_1 {

    public static void main(String[] args) {

        MethodConflict mc = new MethodConflict();

        mc.help();

        MethodConflict_1 mc_1 = new MethodConflict_1();
        mc_1.help();

        System.out.println("---------------exquisite segment line--------------");

        ProxyClass pc = new ProxyClass(new RealClass());

        pc.help();

    }


}

interface Filial {

    public default void help() {

        System.out.println("Filial");

    }

}

interface Spoony {

    public default void help() {

        System.out.println("spoony");

    }

}

class MethodConflict implements Filial, Spoony {

    public void help() {

        System.out.println("MethodConflict");
        Filial.super.help();
        Spoony.super.help();

    }
}

interface Indifferent extends Filial {

    public default void help() {

        System.out.println("Indifferent");

        Filial.super.help();


    }

    public static void run() {

        System.out.println("static method");

    }


}

class MethodConflict_1 implements Indifferent {

    public void help() {

        System.out.println("MethodIndifferent_1");
        Indifferent.super.help();
        Indifferent.run();


    }

}

class RealClass implements Indifferent {

    public void help() {

        //System.out.println("realClass");
        Indifferent.super.help();

    }

}

class ProxyClass implements Filial {

    public RealClass realClass;

    public ProxyClass(RealClass realClass) {

        this.realClass = realClass;

    }

    public void help() {

        Filial.super.help();

    }

}
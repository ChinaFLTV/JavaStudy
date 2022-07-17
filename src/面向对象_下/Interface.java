package 面向对象_下;


public class Interface {

    public static void main(String[] args) {

        Network net = new ProxyServer(new RealServer());
        net.browse();

        SubjectProxy sp = new SubjectProxy();
        sp.doAction();
        sp.byebye();

        ProxyEngine pe = new ProxyEngine(new RealEngine());

        pe.LoadPicture();
        pe.ShowPicture();

        System.out.println("------------------exquisite segment line-----------------");

        C_1 c = new C_1();
        c.pX();


    }


}

interface Runner {

    public abstract void start();

    public abstract void run();

    public abstract void stop();

}

interface Runner_1 extends Runner {

    public abstract void walk();

}

class Person_2 implements Runner, Runner_1 {

    public void start() {

        ;

    }

    public void run() {

        ;

    }

    public void stop() {

        ;

    }

    public void walk() {

        ;

    }

}

interface Network {

    public abstract void browse();

}

class RealServer implements Network {

    public void browse() {

        System.out.println("Browse content with the real server.");

    }

}

class ProxyServer implements Network {

    private Network network;

    public ProxyServer(Network network) {

        this.network = network;

    }

    public void check() {

        System.out.println("Check network connections and else operations.");

    }

    public void browse() {

        check();
        network.browse();

    }
}

interface ISubject {

    public abstract void doAction();

    public abstract void byebye();

}

class RealSubject implements ISubject {

    public void doAction() {

        System.out.println("Real Action Here.");

    }

    public void byebye() {

        System.out.println("Wave byebye.");

    }

}

class SubjectProxy implements ISubject {

    private ISubject isubject;

    public SubjectProxy() {

        isubject = new RealSubject();

    }

    public void doAction() {

        System.out.println(">> doWhatever start.");
        isubject.doAction();
        System.out.println("doWhatever end <<");

    }

    public void byebye() {

        System.out.println("Say byebye.");

    }


}

interface Check {

    public static final String VERSION = "1.1.1";

    public abstract void LoadPicture();

    public abstract void ShowPicture();

}

class RealEngine implements Check {

    public void LoadPicture() {

        System.out.println("Shallow LoadPicture");

    }

    public void ShowPicture() {

        System.out.println("Shallow ShowPicture");

    }

}


class ProxyEngine implements Check {

    public Check realEngine;

    public ProxyEngine(Check realEngine) {

        this.realEngine = realEngine;

    }

    public void LoadPicture() {

        realEngine.LoadPicture();
        System.out.println("Deep LoadPicture");

    }

    public void ShowPicture() {

        realEngine.ShowPicture();
        System.out.println("Deep ShowPicture");

    }
}

interface A_1 {

    public static final int x = 0;

}

class B_1 implements A_1 {

    int x = 1;

}

class C_1 extends B_1 implements A_1 {

    public void pX() {

        System.out.println(super.x);

    }


}

interface Playable{

    public abstract void  play();

}

interface Bounceable{

    public abstract void play();

}

interface Rollable extends Playable,Bounceable{

    Ball ball = new Ball("PingPing");

}

class Ball implements Rollable{

    private String name;

    public String getName(){

        return name;

    }

    public Ball(String name){

        this.name = name;

    }

    public void play(){

        //ball = new Ball("Football");
        System.out.println(ball.getName());

    }
}








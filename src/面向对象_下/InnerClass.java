package 面向对象_下;


public class InnerClass {

    public static void main(String[] args) {

        Outer o = new Outer();
        o.ma();

        Outer_1 o_1 = new Outer_1();
        Outer_1.Inner oi = o_1.new Inner();
        oi.mb(333);

        System.out.println("--------------exquisite segment line--------------");

        Outer_buff_1 ob1 = new Outer_buff_1();
        Outer_buff_1.Outer_buff_2 ob2 = ob1.new Outer_buff_2();
        Outer_buff_1.Outer_buff_2.Outer_buff_3 ob3 = ob2.new Outer_buff_3();
        Outer_buff_1.Outer_buff_2.Outer_buff_3.Outer_buff_4 ob4 = ob3.new Outer_buff_4();
        Outer_buff_1.Outer_buff_2.Outer_buff_3.Outer_buff_4.Outer_buff_5 ob5 = ob4.new Outer_buff_5();
        Outer_buff_1.Outer_buff_2.Outer_buff_3.Outer_buff_4.Outer_buff_5.Outer_buff_6 ob6 = ob5.new Outer_buff_6();
        Outer_buff_1.Outer_buff_2.Outer_buff_3.Outer_buff_4.Outer_buff_5.Outer_buff_6.Outer_buff_7 ob7 = ob6.new Outer_buff_7();
        Outer_buff_1.Outer_buff_2.Outer_buff_3.Outer_buff_4.Outer_buff_5.Outer_buff_6.Outer_buff_7.Outer_bufff_8 ob8 = ob7.new Outer_bufff_8();
        Outer_buff_1.Outer_buff_2.Outer_buff_3.Outer_buff_4.Outer_buff_5.Outer_buff_6.Outer_buff_7.Outer_bufff_8.Outer_buff_9 ob9 = ob8.new Outer_buff_9();
        Outer_buff_1.Outer_buff_2.Outer_buff_3.Outer_buff_4.Outer_buff_5.Outer_buff_6.Outer_buff_7.Outer_bufff_8.Outer_buff_9.Outer_buff_10 ob10 = ob9.new Outer_buff_10();
        ob10.printI(123456);

        System.out.println("-------------exquisite segment line-------------");

        AnonymousClass ac = new AnonymousClass() {

            public void run() {

                ;

            }
        };


        aaaa AA = new aaaa() {

            public void sys() {

                System.out.println("sys");

            }
        };

        Thread t = new Thread() {

            public void run() {

                for (int i = 0; i <= 5; i++) {

                    System.out.println(i + " ");

                }
            }

        };

        System.out.println("-------------exquisite segment line-------------");

        Test t1 = new Test();
        Test.Inner1 ti1 = t1.new Inner1();
        t.start();

        /*anonymousClass ac1 = new anonymousClass(){

            public void run(){

                ;

            }
        };*/

        /*System.out.println("-------------exquisite segment line-------------");

        Test t1 = new Test();
        Test.Inner1 ti1 = t1.new Inner1();
*/

        System.out.println("---------------exquisite segment line--------------");

        DDD ddd = new EEE();

        //ddd.run3();




    }

}

class Outer {

    private int s;

    static {

        //Inner ii = new Inner();

    }

    public class Inner {

        public void mb() {

            s = 100;
            System.out.println("In InnerClass: s = " + s);
            Outer.run();

        }

 /*       public static void test(){

            ;

        }*/

    }

    static class StaticInnerClass {

        public static void test() {

            ;

        }

    }

    public static void run() {

        System.out.println("Static method in OuterClass.");

    }

    public void ma() {

        Inner i = new Inner();
        i.mb();

    }

}


class Outer_1 {

    private int s = 111;

    public class Inner {

        private int s = 222;

        public void mb(int s) {

            System.out.println(s);
            System.out.println(this.s);
            System.out.println(Outer_1.this.s);

        }

    }

}


class Outer_buff_1 {

    private int i = 111;

    public class Outer_buff_2 {

        private int i = 222;

        public class Outer_buff_3 {

            private int i = 333;

            public class Outer_buff_4 {

                private int i = 444;

                public class Outer_buff_5 {

                    private int i = 555;

                    public class Outer_buff_6 {

                        private int i = 666;

                        public class Outer_buff_7 {

                            private int i = 777;

                            public class Outer_bufff_8 {

                                private int i = 888;

                                public class Outer_buff_9 {

                                    private int i = 999;

                                    public class Outer_buff_10 {

                                        private int i = 101010;

                                        public void printI(int i) {

                                            System.out.println(i);
                                            System.out.println(this.i);
                                            System.out.println(Outer_buff_10.this.i);
                                            System.out.println(Outer_buff_9.this.i);
                                            System.out.println(Outer_bufff_8.this.i);
                                            System.out.println((Outer_buff_7.this.i));
                                            System.out.println(Outer_buff_6.this.i);
                                            System.out.println(Outer_buff_5.this.i);
                                            System.out.println(Outer_buff_4.this.i);
                                            System.out.println(Outer_buff_3.this.i);
                                            System.out.println(Outer_buff_2.this.i);
                                            System.out.println(Outer_buff_1.this.i);

                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }

    }
}

interface def {

    ;

}

class abc {

    ;

}

class Outerclass {

    private int i;
    private int o;

    public def innerClass() {

        int iii = 0;
        int o = 10;
        final int jj = 15;

        class LocalClass extends abc implements def {

            int i2 = i;
            int i3 = iii;
            int aaa = Outerclass.this.o;
            int bbb = Outerclass.this.i;
            public static final int S = 666;
            int jjjj = jj;
            //Outerclass.this.i =10;

        }

        LocalClass lc = new LocalClass();
        System.out.println(LocalClass.S);

        return lc;

    }

}

interface H {

    public abstract void fun1();

}

class Outer_2 extends abc implements H {

    public static void hehe() {

        new Outer_2().callInner(new H() {

            public void fun1() {


            }
        });

    }

    public void fun1() {
        ;
    }

    public void callInner(H h) {

        h.fun1();

    }
}


abstract class AnonymousClass {

    public abstract void run();

}

interface aaaa {

    abstract void sys();

    public static void hehe() {

        System.out.println("hehe");

    }


}

class Polygon {

    public void display() {

        System.out.println("In superclass");


    }

}

class AnonymousDemo {

    public void createClass() {

        Polygon p = new Polygon() {

            public void display() {

                System.out.println("In anonymous class.");

            }

        };

    }
}

class Test {

    public Test() {

        Inner1 i1 = new Inner1();
        i1.a = 10;
        Inner1 i2 = new Inner1();
        i1.a = 20;
        Test.Inner1 ti = new Test.Inner1();
        System.out.println(ti.a);

    }

    public class Inner1 {

        public int a = 5;
        public void run2(){

            ;

        }

    }
}

interface AAA{

    ;

}

interface BBB{

    ;

}

interface CCC extends AAA,BBB{

    ;

}

interface DDD{

    ;

}

class EEE implements DDD{

    public void run3(){

        System.out.println("run3");

    }
}


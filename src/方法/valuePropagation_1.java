package 方法;


public class valuePropagation_1 {

    public static void main(String[] args) {

        valuePropagation_1 vp = new valuePropagation_1();
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("after swap:a: " + a + "b: " + b);

        System.out.println("-----------------优美的分割线-------------------");

        DataSwap ds = new DataSwap(6, 8);
        new valuePropagation_1().swap(ds);
        System.out.println("after swap:a: " + ds.a + "b " + ds.b);
        System.out.println("-----------------优美的分割线-------------------");

        valuePropagation_1 vp_1 = new valuePropagation_1();
        vp_1.first();


    }

    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
        System.out.println("in swap:a: " + a + "b: " + b);

    }

    public void swap(DataSwap ds) {

        int temp = ds.a;
        ds.a = ds.b;
        ds.b = temp;
        System.out.println("in swap:a: " + ds.a + "b: " + ds.b);

    }

    public void first() {

        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v,i);
        System.out.println("v.i: "+v.i);


    }

    public void second(Value v,int i){

        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println("v.i: "+v.i+"i: "+i);

    }



}

class DataSwap {

    public int a;
    public int b;

    public DataSwap() {
        ;
    }

    public DataSwap(int a, int b) {

        this.a = a;
        this.b = b;

    }


}

class Value{

    int i = 15;

}

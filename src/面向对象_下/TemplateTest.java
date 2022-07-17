package 面向对象_下;

public class TemplateTest {

    public static void main(String[] args) {

        SubTemplate st = new SubTemplate();
        st.getTime();

    }
}

abstract class Template_1 {

    public final void getTime() {

        long startTime = System.currentTimeMillis();
        code();
        long endTime = System.currentTimeMillis();

        System.out.println("The lasting time of this call is: " + (endTime - startTime) + " ms");

    }

    public abstract void code();


}


class SubTemplate extends Template_1 {

    public void code() {

        for (int i = 0; i < 10000; i++) {

            System.out.println(i);

        }
    }
}


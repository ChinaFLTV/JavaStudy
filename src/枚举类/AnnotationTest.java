package 枚举类;


/*
 **@Author LiGuanda
 **@Data 2022/3/12 下午 3:56
 **@Description This is a description of AnnotationTest
 **@Params
 **@Return
 **@Since versio-1.0  */

import javax.lang.model.element.Element;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@classss
public class AnnotationTest {

    public static void main(String[] args) {

        new azhe().he();
        new azhe().hetui();

    }


    @heiheihei(name = "IU", age = 29)
    public AnnotationTest() {

        super();

    }

}

@Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test {


}


@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.CLASS)
@interface heihei {

    ;

}

@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
@interface hehe {

    ;

}

@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.CLASS)
@interface Variable {

    ;

}

@Target(FIELD)
@Retention(RetentionPolicy.SOURCE)
@interface field {

    ;

}


@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface hahaha {

    ;

}

@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface classss {

    //System.out.println("");
    public static final int a = 666;


}


@hahaha
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.SOURCE)
@Documented
@Inherited
@interface haha {

}


@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface Reference {

    boolean enheng() default true;

    String aha() default "???";

}

@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.SOURCE)
@Documented
@Inherited
//@SafeVarargs
//@Repeatable
@interface heiheihei {

    enum azhe {

        aaa,
        bbb,
        ccc;

    }

    String name() default "en?";

    int age() default 18;

    boolean yesOrNo() default true;

    Reference en() default @Reference(enheng = false, aha = "heiheihei");

    azhe hhh() default azhe.aaa;

    long[] array = new long[]{111, 222, 333};
    //long[] value() ;


}

@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface emmmm {

    ;

}

@SuppressWarnings("unchecked")


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface bbbs {

    bbb[] value();

}


@Repeatable(bbbs.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface bbb {

    enum ccc {

        abcd(1),
        efgh(2),
        hijk(3),
        opq(4);


        private final int num;

        private ccc(int num) {

            this.num = num;

        }


    }

    ccc value() default ccc.abcd;

}


@bbb(value = bbb.ccc.opq)
@bbb(value = bbb.ccc.hijk)
@bbb(value = bbb.ccc.efgh)
@bbb(bbb.ccc.abcd)
class azhe {


    Annotation[] a = azhe.class.getAnnotations();
    bbbs bs = (bbbs) a[0];

    public void he() {
        for (bbb b : bs.value()) {

            System.out.println(b.value().ordinal());

        }

    }

    public void hetui(){

        bbbs bss = azhe.class.getDeclaredAnnotation(bbbs.class);
        for(bbb b: bss.value()){

            System.out.println(b.value());

        }
    }

}


class AClass {

    @Test
    public static void hehe(int a) {

       /* @Target(ElementType.LOCAL_VARIABLE)
        @Retention(RetentionPolicy.RUNTIME)*/
        a = 6;
        @Variable
        int b = 15;

    }

    /*@Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)*/
    public void haha() {


    }


}

@Target(ElementType.TYPE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface ddddd{

    ;

}


@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.CLASS)
@Documented
@Inherited
@interface aabb{

    ;

}



class TTTT<@ddddd String>{

    private int num;

    int nnum = (@aabb int)2L;
    String str = (@aabb String)"4";
    public static <@ddddd T>void hehetui(T t){


        ;

    }


}



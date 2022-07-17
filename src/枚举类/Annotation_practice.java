package 枚举类;


import java.lang.annotation.*;


/**
**@Author LiGuanda
**@Data 2022/3/12 下午 7:15
**@Description This is a description of Annotation_practice
**@Params
**@Return
**@Since versio-1.0  */


public class Annotation_practice {

    public static void main(String[]args){

        Person p = new Person();
        System.out.println(p.toString());


        new AaaTest().heiheiheihei();
        new AaaTest().asas();

    }

}


@classAnnotation
class Person{

    @Override
    @MyTiger(Value="heihei")
    public String toString(){

        System.out.println(Person.class.getAnnotations());
        System.out.println(Person.class.getDeclaredAnnotations());
        System.out.println(Person.class.isAnnotationPresent(classAnnotation.class));
        System.out.println(Person.class.getDeclaredAnnotation(classAnnotation.class));

        return "ABC";

    }


}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface MyTiger{

    String Value() default "default string";

}

@Repeatable(hehehe.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface classAnnotation{

    //String name() default "heihei";

}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface hehehe{

    //int[] array();
    classAnnotation[] value();
    public static final int i = 1;
    public final int i2 = 2;
    public int i3 = 3;
    //private int i4 = 4;


}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface aaas{

    aaa[] value();

}


@Repeatable(aaas.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface aaa{

    String celebrity() default "JuJingyi";

}


@aaa(celebrity="Martoon 5")
@aaa(celebrity="Talyor Swift")
@aaa(celebrity="Jay Chou")
@aaa(celebrity="IU")
class AaaTest{

    Annotation [] array =AaaTest.class.getAnnotations();
    public  void heiheiheihei() {

        System.out.println(array.length);
        aaas arr = (aaas)array[0];
        for (aaa a : arr.value()){

            System.out.println(a.celebrity());

        }

    }

    aaas as = AaaTest.class.getAnnotation(aaas.class);
    public void asas(){

        for(aaa a: as.value()){

            System.out.println(a.celebrity());

        }
    }

}




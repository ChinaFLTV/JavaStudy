package Java集合.CustomArrayList;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/16 上午 8:34
 * *@Description This is a description of CustomArrayList
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


import java.lang.annotation.*;
import java.util.AbstractList;
import java.util.Arrays;


@CustomAnnotation
public class CustomArrayList extends AbstractList {

    private int size;
    protected transient int modCount = 0;
    //private final Abstract<Object> abstractList;

    public Object get(int index) {

        RangeCheck(index);

        return null;

    }


    public int size() {

        return this.size;

    }

    public void RangeCheck(int index) {

        if (index < 0 || index > this.size()) {

            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));

        }

    }


    private String outOfBoundsMsg(int index) {

        return "index: " + index + "\t\tsize: " + this.size;

    }

    private void checkForComdification() {

        //if (this.modCount != abstractList.modCount)

    }

}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface CustomAnnotation {

    ;

}
package 面向对象;


/*4.7 面向对象特征之一：封装和隐藏
        信息的封装和隐藏
        Java中通过将数据声明为私有的(private)，再提供公共的（public）
        方法:getXxx()和setXxx()实现对该属性的操作，以实现下述目的：
        隐藏一个类中不需要对外提供的实现细节；
        使用者只能通过事先定制好的方法来访问数据，可以方便地加入控制逻辑，
        限制对属性的不合理操作；
        便于修改，增强代码的可维护性*/
public class encapsulationAndConcealment {

    public static void main(String[] args) {
//        while (true) {
        Animal_1 an = new Animal_1();
        an.setLegs(4);
        System.out.println("The miraculous animal may have " + an.getLegs() + " legs.");

        System.out.println("-------------------exquisite segment line---------------------");

        Person_2 pe = new Person_2();
        pe.setAge(66);
        System.out.println("This person's age is " + pe.getAge() + " years old.");
        Person_2 pe_2 = new Person_2(18,"Tayor");
        System.out.println("This person's age is "+pe_2.getAge()+" years old and his or her name is "+pe_2.getName()+" .");

//        }

    }


}

class Animal_1 {

    private int legs;

    public void setLegs(int i) {

        if ((i != 0) && (i != 2) && (i != 4)) {

            System.out.println("The num which you inputted a while back is wrong!");
            return;

        } else {

            legs = i;

        }

    }

    public int getLegs() {

        return legs;

    }

}

class Person_2 {

    private int age;
    private String name;

    public Person_2(){
        ;
    }

    public Person_2(int i,String s){

        age = i;
        name = s;

    }

    public void setAge(int a) {

        if (a > 0 && a <= 130) {

            age = a;

        } else {

            System.out.println("What a doltish num you inputted!");
            return;

        }


    }

    public int getAge() {

        return age;

    }

    public String getName(){

        return name;

    }


}

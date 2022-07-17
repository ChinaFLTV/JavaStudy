package 面向对象;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*4. 对象数组题目：
        定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
        score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
        问题一：打印出3年级(state值为3）的学生信息。
        问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        提示：
        1) 生成随机数：Math.random()，返回值类型double;
        2) 四舍五入取整：Math.round(double d)，返回值类型long。*/
public class methodPractice_1 {

    public static void main(String[] args) {

        Student_1[] array = new Student_1[20];

        for (int i = 0; i < array.length; i++) {

            array[i] = (Student_1) (createStudent.createStudent());
            array[i].number = (array[i]).getScores_1();
            //System.out.println(array[i].getClass().toString());


        }

        for (int k = 0; k < array.length; k++) {

            if (array[k].state == 3) {

                System.out.println("number: " + array[k].number + "\t\t state: " + array[k].state + "\t\t scores: " + array[k].scores);

            }

        }
        System.out.println("------------------------优美的分割线------------------------------");

        bubbleSort(array);
        for (Student_1 s : array) {

            System.out.println("number: " + s.number + "\t\t state: " + s.state + "\t\t scores: " + s.scores);

        }


    }

    public static void bubbleSort(Student_1[] temp) {

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {

                if (temp[j].scores > temp[j + 1].scores) {

                    Student_1 tempStudent = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = tempStudent;

                }

            }


        }

    }


}

class Student_1 {

    public int number;
    public int state;
    public int scores;

    public Student_1() {

        ;

    }

    public Student_1(int nu, int st, int sc) {

        number = nu;
        state = st;
        scores = sc;

    }


    public void getScores() {

        System.out.println("该名童鞋的成绩是：" + scores);

    }

    public int getScores_1() {

        return scores;

    }


}

class createStudent {

    public static Object createStudent() {

        Random random = new Random();
        int state = (int) (random.nextInt(3) + 1);
        myThread mt = new myThread();

        mt.runAssist();
        int scores = mt.tempRandom;
        //System.out.println(scores);


        Student_1 object = new Student_1(0, state, scores);


        return object;
    }


}

class myThread extends Thread {

    public int tempRandom;
    //public int cs;

    public void run() {

        //cs = (int)(ThreadLocalRandom.current().nextInt());

        //tempRandom = (int)(ThreadLocalRandom.current().nextDouble()*10+1);
        //System.out.println((int)(ThreadLocalRandom.current().nextDouble()*10+1));
        tempRandom = (int) Math.round(Math.random() * 100 + 1);
        //System.out.println((int)(Math.random()*100+1));
        //System.out.println(tempRandom);

    }


    public void runAssist() {

        tempRandom = (int) Math.round(Math.random() * 100 + 1);

    }


}






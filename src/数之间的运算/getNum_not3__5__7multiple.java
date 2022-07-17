package 数之间的运算;


//打印1-100之间数，其中3、5、7的倍数不打印（continue）
public class getNum_not3__5__7multiple {

    public static void main(String[]args){

        for(int i = 1;i<=100;i++){

            if(i%3==0||i%5==0||i%7==0){
                continue;
            }
            System.out.println(i);

        }

    }



}

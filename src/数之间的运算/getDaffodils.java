package 数之间的运算;


/*

输出所有的水仙花数
所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如： 153 = 1*1*1 + 3*3*3 + 5*5*5

 */
public class getDaffodils {

    public static void main(String[] args){

        for( int i = 100;i<100;i++){
            int j_1 = 0;
            int j_2 = 0;
            int j_3 = 0;

            j_1 = i/100;
            j_2 = (i-100*j_1)/10;
            j_3=i-100*j_1-10*j_2;

            if(i==(int)Math.pow(j_1,3)+(int)Math.pow(j_2,3)+(int)Math.pow(j_3,3)){
                System.out.println("此数值满足水仙花数的条件："+i);
            }



        }

    }

}

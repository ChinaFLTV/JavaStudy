package 图形打印;


//打印如下三角形
/*

*
***
*****
*******
*****
***
*

 */
public class draw_triangle_vertical {

    public static void main(String[] args){

        for(int i = 0;i<7;i++) {
            if (i < 4){

                for(int j = 0;j<2*i+1;j++){

                    System.out.print("*");

                }
                System.out.println("");
            }else{
                for(int k = 0;k<13-2*i;k++){

                    System.out.print("*");
                }
                System.out.println("");

            }
        }






    }



}

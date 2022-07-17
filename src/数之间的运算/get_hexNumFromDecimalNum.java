package 数之间的运算;


//如何求一个0~255范围内的整数的十六进制值，例如60的十六进制表示形式
public class get_hexNumFromDecimalNum {


    public static void main(String[] args){
    String str_1 = Integer.toBinaryString(60);
    System.out.println(str_1);


    String str_2 = Integer.toHexString(60);
    System.out.println(str_2);



    int i_1 = 60;
    int i_2 = i_1&15;
    String j = (i_2>9)?(i_2-10+"A")+"":i_2+"";

    int temp = i_1>>>4;
    i_2 = temp&15;
    String k = (i_2>9)?(i_2-10+"A")+"":i_2+"";
    System.out.println(k+"\t\t"+j);




    }


}

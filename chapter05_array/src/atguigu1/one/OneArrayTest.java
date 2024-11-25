package atguigu1.one;

/**
 * ClassName: OneArrayTest
 * Package: atguigu1.one
 * Description:
 *
 * @Author LiKang
 * @Create 2024/7/22 14:37
 * @Version 1.0
 */
public class OneArrayTest {
    public static void main(String[] args){
        //静态初始化
        int[] arry;
        arry = new int[]{0,1,2,3};
        //动态初始化
        int[] arry1 = new int[]{1,2,3,4};
        //遍历
        for(int i=0;i<arry1.length;i++){
            System.out.println(arry1[i]);
        }
        //不同数据类型的初始值
        //int 默认值为0
        int[] arry2 = new int[2];
        System.out.println(arry2[0]);
        //double 默认值为0.0
        double[] arry3 = new double[2];
        System.out.println(arry3[0]);
        //char 默认值为0 '/u0000'
        char[] arry4 = new char[2];
        System.out.println(arry4[0]);
        //boolean
        boolean b = Boolean.FALSE;
        System.out.println(b);
        //String、引用数据类型 默认值为null
        String[] arry5 = new String[2];
        System.out.println(arry5[0]);
        //数组的内存解析:arry存放在栈空间，占一桢；1，2，3，4存放在堆空间；存放指向堆空间的首地址即1的地址；
        //new才会开辟堆空间
        int[] arry6 = new int[]{1,2,3,4};
        System.out.println(arry6);
        int[] arry7;
        arry7 = arry6;
        System.out.println(arry7);
    }
}

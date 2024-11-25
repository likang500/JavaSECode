/**
 * ClassName: test
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/10 17:08
 * @Version 1.0
 */
public class test {
    public static void main(String[] args){
        int[] aint1   = {1,2,3,4,5};
        int[] aint2 = new int[10];
        System.arraycopy(aint1,0,aint2,0,4);
        for (int i = 0; i < aint2.length; i++) {
            System.out.println(aint2[i]);
        }
    }




}

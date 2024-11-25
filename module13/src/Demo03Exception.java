/**
 * ClassName: Demo03Exception
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/3 10:55
 * @Version 1.0
 */
public class Demo03Exception {
    public static void main(String[] args){
        String s = "a.txt";
        Method(s);
    }
    public static void Method(String s){
        if(!s.endsWith(".txt1")){
            //创建异常对象
            throw new NullPointerException();
        }
        System.out.println("我要执行了");
    }
}

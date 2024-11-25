import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: Demo04Exception
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/3 11:07
 * @Version 1.0
 */
public class Demo04Exception {
    public static void main(String[] args)throws FileNotFoundException,IOException {
        String s = null;
        //String s = ".txt1`";
        try {
            add(s);
        }catch (FileNotFoundException e){//多个catch
            System.out.println(e);
        }catch (IOException e){
            e.printStackTrace();
        }
        delete();
        update();
        find();
    }

    private static void update() {
        System.out.println("我要开始执行了");
    }

    private static void find() {
        System.out.println("我要开始执行了");
    }

    private static void delete() {
        System.out.println("我要开始执行了");
    }

    private static void add(String s)throws FileNotFoundException,IOException {//throw可以仅写父类异常
        if(s == null){
            throw new IOException("IO异常");
        }
        if(! s.endsWith(".txt")){
            throw new FileNotFoundException("找不到文件");
        }
        System.out.println("我要开始执行了");
    }
}

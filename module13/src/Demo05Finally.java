import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: Demo05Finally
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/3 14:49
 * @Version 1.0
 */
public class Demo05Finally {
    public static void main(String[] args){
        FileWriter fw = null;
        try {
            fw = new FileWriter("asd\\1.txt");
            fw.write("hi");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try{
                    fw.close();
                }catch (IOException e){
                    throw new RuntimeException();
                }
            }
        }
    }
}

package atguigu02.singleton;

/**
 * ClassName: GirlFriendTest
 * Package: atguigu02.singleton
 * Description:懒人式单例模式。存在错误
 *
 * @Author LiKang
 * @Create 2024/7/30 22:11
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args){
        //GirlFriend girlFriend = GirlFriend.getInstance();
}
static class GirlFriend {
    private GirlFriend(){
    }

}
    private static GirlFriend instance = null;
    public GirlFriend getInstance() {
        if (instance == null) {
            instance = new GirlFriend();
        }
        return instance;
    }
}
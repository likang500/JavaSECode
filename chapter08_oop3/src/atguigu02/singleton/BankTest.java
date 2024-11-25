package atguigu02.singleton;

/**
 * ClassName: BankTest
 * Package: atguigu02.singleton
 * Description:饿人式单例模式。存在错误
 * @Author LiKang
 * @Create 2024/7/30 21:47
 * @Version 1.0
 */
public class BankTest{
    public static void main(String[] args){
//        Bank ban1 = new Bank();
//        Bank ban2 = new Bank();
        Bank ban1 = Bank.getInstance();
        Bank ban2 = Bank.getInstance();
        if(ban2.equals(ban1))
            System.out.println("1");
    }
}
class Bank{
    private Bank(){
    }
    private static Bank bank = new Bank();

    public static Bank getInstance(){
        return bank;
    }
}


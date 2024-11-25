package com.atguigu.a_collections.l_dielock;

/**
 * ClassName: DieLock
 * Package: com.atguigu.l_dielock
 * Description:
 *
 * @Author LiKang
 * @Create 2024/9/29 20:28
 * @Version 1.0
 */
public class DieLock implements Runnable{
    public boolean flag;

    public DieLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (LockA.lockA){
                System.out.println("if...lockA");
                synchronized (LockB.lockB){
                    System.out.println("if...lockB");
                }
            }
        }else{
            synchronized (LockB.lockB){
                System.out.println("else...lockB");
                synchronized (LockA.lockA){
                    System.out.println("else...lockA");
                }
            }
        }
    }
}

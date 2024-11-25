package com.atguigu.a_collections.a_wait_notify.a_wait_notify;

/**
 * ClassName: BaoZiPu
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author LiKang
 * @Create 2024/10/9 21:56
 * @Version 1.0
 */
public class BaoZiPu {
    private int count;
    private boolean flag;

    public BaoZiPu() {
    }

    public BaoZiPu(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    public synchronized void getCount() {
        //判断flag是否为false，如果是false，证明没有包子，消费线程等带
        if(this.isFlag() == false){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果flag为true，证明有包子。开始消费
        //count--;
        System.out.println("消费了..第" + count + "个包子");
        //改变flag状态为false，证明消费完了，没有包子了
        this.flag=false;
        //唤醒生产线程
        this.notify();

    }

    public boolean isFlag() {
        return flag;
    }

    public synchronized void setCount() {

        //判断flag是否为true，如果有包子，生产等待
        if(this.isFlag() == true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果flag为false，证明有包子。开始生产
        count++;
        System.out.println("生产了..第" + count + "个包子");
        //改变flag状态为true，证明生产完了，有包子了
        this.flag=true;
        //唤醒消费线程
        this.notify();
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

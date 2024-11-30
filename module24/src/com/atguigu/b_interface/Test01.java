package com.atguigu.b_interface;


/**
 * @author likang
 * @create 2024-11-29 16:56
 * @function
 */
public class Test01 {
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public void open(String strign) {
                System.out.println("开启了");
            }
        });

        method((String sting)->{
                System.out.println("开启了");
            }
        );
    }
    public static void method(USB usb){
        usb.open("鼠标");
    }
}

package com.atguigu.a_lambda;

/**
 * @author likang
 * @create 2024-11-29 11:23
 * @function
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public void open() {

            }
        });

        method(()-> System.out.println("usb打开了"));
    }

    /**
     *
     * @param usb
     */
    private static void method(USB usb) {
        usb.open();
    }
}

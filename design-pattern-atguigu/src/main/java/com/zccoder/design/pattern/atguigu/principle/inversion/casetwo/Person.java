package com.zccoder.design.pattern.atguigu.principle.inversion.casetwo;

/**
 * Person接收消息的功能
 *
 * @author zc 2019-10-15
 */
public class Person {

    public void receive(Receiver receiver) {
        // 这里是对接口的依赖
        System.out.println(receiver.getInfo());
    }
}

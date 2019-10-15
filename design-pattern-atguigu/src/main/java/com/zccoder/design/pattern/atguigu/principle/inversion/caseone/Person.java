package com.zccoder.design.pattern.atguigu.principle.inversion.caseone;

/**
 * Person接收消息的功能
 *
 * @author zc 2019-10-15
 */
public class Person {

    public void receive(Email email) {
        // 1.简单，容易想到。
        // 2.如果我们获取的对象是微信、短信等，则新增类，同时Person类也要增加相应的接收方法
        // 3.解决思路：引入一个抽象的接口Receiver，表示接收者，这样Person类于接口发生依赖
        // 4.因为Email，WeiXin等等属于接收的范围，他们各自实现Receiver接口就ok，这样就符合依赖倒转原则
        System.out.println(email.getInfo());
    }
}

package com.zccoder.design.pattern.atguigu.principle.inversion.casetwo;

/**
 * 依赖倒转原则
 *
 * @author zc 2019-10-15
 */
public class Dependency {

    public static void main(String[] args) {
        // 客户端无需改变
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }
}

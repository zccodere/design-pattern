package com.zccoder.design.pattern.atguigu.principle.inversion.caseone;

/**
 * 依赖倒转原则
 *
 * @author zc 2019-10-15
 */
public class Dependency {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

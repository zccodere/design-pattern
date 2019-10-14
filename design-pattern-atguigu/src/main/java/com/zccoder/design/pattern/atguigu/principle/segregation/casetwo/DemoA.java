package com.zccoder.design.pattern.atguigu.principle.segregation.casetwo;

/**
 * 客户端A。DemoA 类通过接口 Interface1,Interface2 依赖（使用） B类，但是只会用到1,2,3方法
 *
 * @author zc 2019-10-14
 */
public class DemoA {

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface2 interface2) {
        interface2.operation2();
    }

    public void depend3(Interface2 interface2) {
        interface2.operation3();
    }

}

package com.zccoder.design.pattern.atguigu.principle.segregation.caseone;

/**
 * 客户端C。DemoC 类通过接口 Interface1 依赖（使用） D类，但是只会用到1,4,5方法
 *
 * @author zc 2019-10-14
 */
public class DemoC {

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }

    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }

}

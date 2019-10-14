package com.zccoder.design.pattern.atguigu.principle.segregation.casetwo;

/**
 * DemoB 实现类
 *
 * @author zc 2019-10-14
 */
public class DemoB implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("DemoB 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("DemoB 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("DemoB 实现了 operation3");
    }

}

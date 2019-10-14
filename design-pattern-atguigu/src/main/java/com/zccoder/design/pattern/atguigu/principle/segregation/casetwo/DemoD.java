package com.zccoder.design.pattern.atguigu.principle.segregation.casetwo;

/**
 * DemoD 实现类
 *
 * @author zc 2019-10-14
 */
public class DemoD implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("DemoD 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("DemoD 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("DemoD 实现了 operation5");
    }
}

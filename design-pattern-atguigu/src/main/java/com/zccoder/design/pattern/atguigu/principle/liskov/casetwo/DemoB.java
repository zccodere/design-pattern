package com.zccoder.design.pattern.atguigu.principle.liskov.casetwo;

/**
 * B类。增加新功能：完成两个数相加，然后后9求和。
 *
 * @author zc 2019-10-15
 */
public class DemoB extends BaseDemo {

    /**
     * 如果B类需要使用A类的方法，使用组合关系
     */
    private DemoA demoa = new DemoA();

    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        // 这里仍然使用A的方法
        return this.demoa.func1(a, b);
    }
}

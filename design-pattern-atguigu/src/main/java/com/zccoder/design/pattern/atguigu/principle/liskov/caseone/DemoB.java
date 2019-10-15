package com.zccoder.design.pattern.atguigu.principle.liskov.caseone;

/**
 * B类。增加新功能：完成两个数相加，然后后9求和
 *
 * @author zc 2019-10-15
 */
public class DemoB extends DemoA {

    @Override
    public int func1(int num1, int num2) {
        // 这里，重写了A类的方法，可能是无意识的
        return num1 + num2;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}

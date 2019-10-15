package com.zccoder.design.pattern.atguigu.principle.liskov.caseone;

/**
 * A类
 *
 * @author zc 2019-10-15
 */
public class DemoA {

    /**
     * 计算两个数的差
     *
     * @param num1 被减数
     * @param num2 减数
     * @return 差
     */
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

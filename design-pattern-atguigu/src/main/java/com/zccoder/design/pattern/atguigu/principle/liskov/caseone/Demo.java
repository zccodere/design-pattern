package com.zccoder.design.pattern.atguigu.principle.liskov.caseone;

/**
 * 演示
 *
 * @author zc 2019-10-15
 */
public class Demo {

    public static void main(String[] args) {
        DemoA demoa = new DemoA();
        System.out.println("11-3=" + demoa.func1(11, 3));
        System.out.println("1-8=" + demoa.func1(1, 8));

        System.out.println("--");

        DemoB demob = new DemoB();
        System.out.println("11-3=" + demob.func1(11, 3));
        System.out.println("1-8=" + demob.func1(1, 8));
        System.out.println("11-3+9=" + demob.func2(11, 3));
    }

}

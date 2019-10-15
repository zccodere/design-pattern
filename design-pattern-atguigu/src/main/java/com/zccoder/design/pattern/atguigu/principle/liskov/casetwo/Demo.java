package com.zccoder.design.pattern.atguigu.principle.liskov.casetwo;

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
        // 因为B类不再继承A类，因此调用者不会再认为func1是求减法。调用完成的功能就会很明确
        System.out.println("11+3=" + demob.func1(11, 3));
        System.out.println("1+8=" + demob.func1(1, 8));
        System.out.println("11-3+9=" + demob.func2(11, 3));

        // 使用组合让然可以使用到A类的方法；这里本意也是求11-3
        System.out.println("11-3=" + demob.func3(11, 3));
    }

}

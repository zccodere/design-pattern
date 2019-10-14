package com.zccoder.design.pattern.atguigu.principle.single.casethree;

/**
 * 单一职责原则
 *
 * @author zc 2019-10-14
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        // 1.这种修改方法没有对原来的类做大的修改，只是增加方法。2.虽然没有在类这个级别上没有遵守单一职责原则，但是在方法级别上，仍然遵守单一职责级别
        Vehicle vehicle = new Vehicle();
        vehicle.run("奥迪A6");
        vehicle.run("摩托车");

        vehicle.runAir("飞机");

        vehicle.runWater("游轮");
    }
}

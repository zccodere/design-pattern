package com.zccoder.design.pattern.atguigu.principle.single.caseone;

/**
 * 单一职责原则
 *
 * @author zc 2019-10-14
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        // 未遵守单一职责原则
        Vehicle vehicle = new Vehicle();
        vehicle.run("奥迪A6");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }
}

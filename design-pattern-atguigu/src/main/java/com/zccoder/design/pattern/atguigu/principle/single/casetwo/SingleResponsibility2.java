package com.zccoder.design.pattern.atguigu.principle.single.casetwo;

/**
 * 单一职责原则
 *
 * @author zc 2019-10-14
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        // 1.遵守了单一职责原则。
        // 2.但是这样做改动很大，即将类分解，同时修改客户端。
        // 3.改进：直接修改Vehicle类，改动的代码会比较少。
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("奥迪A6");
        roadVehicle.run("摩托车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("游轮");
    }
}

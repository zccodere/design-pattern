package com.zccoder.design.pattern.atguigu.principle.single.casethree;

/**
 * 交通工具类
 *
 * @author zc 2019-10-14
 */
public class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中上运行...");
    }
}

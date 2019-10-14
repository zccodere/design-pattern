package com.zccoder.design.pattern.atguigu.principle.single.caseone;

/**
 * 交通工具类
 *
 * @author zc 2019-10-14
 */
public class Vehicle {

    public void run(String vehicle) {
        // 1. run方法中，违反了单一职责原则。2. 解决办法：根据交通工具运行方法不同，分解成不同类即可。
        System.out.println(vehicle + " 在公路上运行...");
    }
}

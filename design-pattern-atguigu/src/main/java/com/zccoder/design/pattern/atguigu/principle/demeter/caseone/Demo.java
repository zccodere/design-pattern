package com.zccoder.design.pattern.atguigu.principle.demeter.caseone;

/**
 * 演示类
 *
 * @author zc 2019-10-16
 */
public class Demo {

    public static void main(String[] args) {
        // 客户端
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

package com.zccoder.design.pattern.atguigu.principle.demeter.casetwo;

/**
 * 演示类
 *
 * @author zc 2019-10-16
 */
public class Demo {

    public static void main(String[] args) {
        // 客户端，使用迪米特法则的改进
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

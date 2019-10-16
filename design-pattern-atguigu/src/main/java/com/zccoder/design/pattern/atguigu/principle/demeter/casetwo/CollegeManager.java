package com.zccoder.design.pattern.atguigu.principle.demeter.casetwo;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院员工管理类
 *
 * @author zc 2019-10-16
 */
public class CollegeManager {

    /**
     * 获取学院所有员工
     *
     * @return 员工列表
     */
    public List<CollegeEmployee> listAll() {
        List<CollegeEmployee> employeeList = new ArrayList<>(16);
        int count = 10;
        for (int i = 0; i < count; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("2学院员工id=" + i);
            employeeList.add(employee);
        }
        return employeeList;
    }

    /**
     * 输出学院员工信息
     */
    public void printAllEmployee() {
        List<CollegeEmployee> collegeEmployeeList = this.listAll();
        System.out.println("----------学院员工----------");
        collegeEmployeeList.forEach(employee -> System.out.println(employee.getId()));
    }
}

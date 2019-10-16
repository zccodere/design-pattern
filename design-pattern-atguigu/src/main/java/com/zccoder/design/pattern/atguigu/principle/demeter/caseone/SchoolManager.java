package com.zccoder.design.pattern.atguigu.principle.demeter.caseone;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校管理类。该类的直接朋友有Employee、CollegeManager。不是直接朋友有CollegeEmployee类，这违背了迪米特法则
 *
 * @author zc 2019-10-16
 */
public class SchoolManager {

    /**
     * 获取学校总部所有员工
     *
     * @return 员工列表
     */
    public List<Employee> listAll() {
        List<Employee> employeeList = new ArrayList<>(16);
        int count = 5;
        for (int i = 0; i < count; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id=" + i);
            employeeList.add(employee);
        }
        return employeeList;
    }

    /**
     * 输出学校总部和学院员工信息
     *
     * @param collegeManager 学院员工列表
     */
    public void printAllEmployee(CollegeManager collegeManager) {
        // 1.CollegeEmployee类不是SchoolManager类的直接朋友
        // 2.CollegeEmployee类是以局部变量的形式出现在SchoolManager类
        // 3.违反了迪米特法则
        List<CollegeEmployee> collegeEmployeeList = collegeManager.listAll();
        System.out.println("----------学院员工----------");
        collegeEmployeeList.forEach(employee -> System.out.println(employee.getId()));

        List<Employee> employeeList = this.listAll();
        System.out.println("----------学校总部员工----------");
        employeeList.forEach(employee -> System.out.println(employee.getId()));
    }
}

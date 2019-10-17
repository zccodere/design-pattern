package com.zccoder.design.pattern.atguigu.uml.dependence;

/**
 * UML类图依赖关系
 *
 * @author zc 2019-10-17
 */
public class PersonServiceBean {

    /**
     * 以成员变量的形式 依赖了 PersonDao 类
     */
    private PersonDao personDao;

    public void save(Person person) {
        // 以方法参数的形式 依赖了 Person 类
    }

    public IdCard getIdCard(Integer personId) {
        // 以方法返回类型的形式 依赖了 IdCard 类
        return null;
    }

    public void modify() {
        // 以局部变量的形式 依赖了 Department 类；这里违反了迪米特法则，但是依赖关系是存在的
        Department department = new Department();
    }
}

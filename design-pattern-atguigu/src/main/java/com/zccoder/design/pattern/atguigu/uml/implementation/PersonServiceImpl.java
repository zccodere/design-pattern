package com.zccoder.design.pattern.atguigu.uml.implementation;

/**
 * 服务实现类，实现关系，也是依赖关系的特例
 *
 * @author zc 2019-12-03
 */
public class PersonServiceImpl implements PersonService {

    @Override
    public void delete(Integer id) {
        System.out.println("delete success：" + id);
    }
}

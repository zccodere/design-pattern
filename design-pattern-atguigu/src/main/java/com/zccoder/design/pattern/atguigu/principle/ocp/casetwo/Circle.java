package com.zccoder.design.pattern.atguigu.principle.ocp.casetwo;

/**
 * 圆形
 *
 * @author zc 2019-10-16
 */
public class Circle extends AbstractShape {

    public Circle() {
        super.setType(2);
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

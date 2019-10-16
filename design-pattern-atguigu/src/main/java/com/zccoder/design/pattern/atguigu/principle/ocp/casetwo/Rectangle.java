package com.zccoder.design.pattern.atguigu.principle.ocp.casetwo;

/**
 * 矩形
 *
 * @author zc 2019-10-16
 */
public class Rectangle extends AbstractShape {

    public Rectangle() {
        super.setType(1);
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

package com.zccoder.design.pattern.atguigu.principle.ocp.casetwo;

/**
 * 新增的三角形
 *
 * @author zc 2019-10-16
 */
public class Triangle extends AbstractShape {

    public Triangle() {
        super.setType(3);
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

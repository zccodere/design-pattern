package com.zccoder.design.pattern.atguigu.principle.ocp.casetwo;

/**
 * 用于绘图的类
 *
 * @author zc 2019-10-16
 */
public class GraphicEditor {

    public void drawShape(AbstractShape shape) {
        shape.draw();
    }
}

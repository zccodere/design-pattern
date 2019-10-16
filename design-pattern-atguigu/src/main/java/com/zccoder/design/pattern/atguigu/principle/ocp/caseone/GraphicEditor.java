package com.zccoder.design.pattern.atguigu.principle.ocp.caseone;

/**
 * 用于绘图的类
 *
 * @author zc 2019-10-16
 */
public class GraphicEditor {

    private static final Integer ONE = 1;
    private static final Integer TWO = 2;
    private static final Integer THREE = 3;

    public void drawShape(Shape shape) {
        // 接收Shape对象，根据type绘制不同的图形
        // 1.优点是比较好理解，简单易操作
        // 2.缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码
        // 3.比如我们这时要新增加一个图形种类，三角形，修改的地方较多
        if (ONE.equals(shape.getType())) {
            drawRectangle(shape);
        } else if (TWO.equals(shape.getType())) {
            drawCircle(shape);
        } else if (THREE.equals(shape.getType())) {
            // 新增图形种类需要修改的地方
            drawTriangle(shape);
        }
    }

    public void drawRectangle(Shape shape) {
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape shape) {
        System.out.println("绘制圆形");
    }

    public void drawTriangle(Shape shape) {
        // 新增图形种类需要修改的地方
        System.out.println("绘制三角形");
    }

}

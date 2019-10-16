package com.zccoder.design.pattern.atguigu.principle.ocp.caseone;

/**
 * 演示
 *
 * @author zc 2019-10-16
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
    }
}

package com.zccoder.design.pattern.atguigu.principle.ocp.casetwo;

/**
 * 其它图形
 *
 * @author zc 2019-10-16
 */
public class OtherGraphic extends AbstractShape {

    public OtherGraphic() {
        super.setType(4);
    }

    @Override
    public void draw() {
        System.out.println("绘制其它图形");
    }
}

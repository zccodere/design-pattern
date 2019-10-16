package com.zccoder.design.pattern.atguigu.principle.ocp.casetwo;

/**
 * 图形基类
 *
 * @author zc 2019-10-16
 */
public abstract class AbstractShape {

    /**
     * 类型
     */
    private Integer type;

    /**
     * 绘制方法
     */
    public abstract void draw();

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}

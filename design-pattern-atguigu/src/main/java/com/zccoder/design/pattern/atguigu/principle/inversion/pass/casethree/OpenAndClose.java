package com.zccoder.design.pattern.atguigu.principle.inversion.pass.casethree;

/**
 * 开关接口。方式三：通过setter方法传递
 *
 * @author zc 2019-10-15
 */
public interface OpenAndClose {

    /**
     * 开。抽象方法
     */
    void open();

    /**
     * 设置电视
     *
     * @param tv 电视
     */
    void setTv(Tv tv);
}

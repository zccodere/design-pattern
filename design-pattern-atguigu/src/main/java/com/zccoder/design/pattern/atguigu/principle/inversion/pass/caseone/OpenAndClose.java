package com.zccoder.design.pattern.atguigu.principle.inversion.pass.caseone;

/**
 * 开关接口。方式一：通过接口传递实现依赖
 *
 * @author zc 2019-10-15
 */
public interface OpenAndClose {

    /**
     * 开。抽象方法，接收接口。
     *
     * @param tv 电视
     */
    void open(Tv tv);
}

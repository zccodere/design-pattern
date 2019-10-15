package com.zccoder.design.pattern.atguigu.principle.inversion.pass.caseone;

/**
 * 实现开关接口
 *
 * @author zc 2019-10-15
 */
public class OpenAndCloseImpl implements OpenAndClose {

    @Override
    public void open(Tv tv) {
        tv.play();
    }
}
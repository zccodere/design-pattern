package com.zccoder.design.pattern.atguigu.principle.inversion.pass.casethree;

/**
 * 实现开关接口
 *
 * @author zc 2019-10-15
 */
public class OpenAndCloseImpl implements OpenAndClose {

    private Tv tv;

    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(Tv tv) {
        this.tv = tv;
    }
}
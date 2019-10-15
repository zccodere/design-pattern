package com.zccoder.design.pattern.atguigu.principle.inversion.pass.casetwo;

/**
 * 实现开关接口
 *
 * @author zc 2019-10-15
 */
public class OpenAndCloseImpl implements OpenAndClose {

    private Tv tv;

    public OpenAndCloseImpl(Tv tv) {
        // 构造器传入
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}
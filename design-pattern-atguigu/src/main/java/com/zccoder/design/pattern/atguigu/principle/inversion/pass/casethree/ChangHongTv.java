package com.zccoder.design.pattern.atguigu.principle.inversion.pass.casethree;

/**
 * 长虹电视机
 *
 * @author zc 2019-10-15
 */
public class ChangHongTv implements Tv {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}

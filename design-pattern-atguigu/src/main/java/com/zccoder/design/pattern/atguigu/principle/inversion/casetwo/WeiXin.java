package com.zccoder.design.pattern.atguigu.principle.inversion.casetwo;

/**
 * 微信消息
 *
 * @author zc 2019-10-15
 */
public class WeiXin implements Receiver {

    @Override
    public String getInfo() {
        return "微信消息：Hello, ok!";
    }
}

package com.zccoder.design.pattern.atguigu.principle.inversion.casetwo;

/**
 * 定义消息接收接口
 *
 * @author zc 2019-10-15
 */
public interface Receiver {

    /**
     * 获取消息
     *
     * @return 消息
     */
    String getInfo();
}

package com.zccoder.design.pattern.atguigu.principle.inversion.casetwo;

/**
 * 电子邮件类
 *
 * @author zc 2019-10-15
 */
public class Email implements Receiver {

    @Override
    public String getInfo() {
        return "电子邮件信息：Hello,World！";
    }

}

package com.zccoder.design.pattern.atguigu.principle.inversion.pass.caseone;

/**
 * 演示
 *
 * @author zc 2019-10-15
 */
public class Demo {

    public static void main(String[] args) {
        ChangHongTv changHongTv = new ChangHongTv();
        OpenAndClose openAndClose = new OpenAndCloseImpl();
        openAndClose.open(changHongTv);
    }
}

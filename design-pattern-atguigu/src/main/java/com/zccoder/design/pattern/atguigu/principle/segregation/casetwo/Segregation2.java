package com.zccoder.design.pattern.atguigu.principle.segregation.casetwo;

/**
 * 演示
 *
 * @author zc 2019-10-15
 */
public class Segregation2 {

    public static void main(String[] args) {
        DemoA demoa = new DemoA();
        DemoB demob = new DemoB();
        // A 类通过接口去依赖 B类
        demoa.depend1(demob);
        demoa.depend2(demob);
        demoa.depend3(demob);

        DemoC democ = new DemoC();
        // C 类通过接口去依赖 D类
        DemoD demod = new DemoD();
        democ.depend1(demod);
        democ.depend4(demod);
        democ.depend5(demod);
    }
}

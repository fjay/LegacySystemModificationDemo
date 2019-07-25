package org.team4u.lsmd.d1;

public class WrapAddDemo {

    private DemoV1 demo;

    public WrapAddDemo(DemoV1 demo) {
        this.demo = demo;
    }

    public void scan(String x) {
        addSomething(x);
        demo.scan(x);
    }

    public void addSomething(String x) {
        // 可使用TDD测试
    }
}
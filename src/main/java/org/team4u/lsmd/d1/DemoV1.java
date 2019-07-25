package org.team4u.lsmd.d1;

public class DemoV1 {

    private static void x() {
        // 这里是一个非常复杂的方法
    }

    public void scan(String x) {
        // TODO 新增功能

        String result = x + x;

        // Show result in console"
        System.out.println(result);

        new Invoker().invoke();

        x();
    }
}

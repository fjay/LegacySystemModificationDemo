package org.team4u.lsmd.d1;

public class DemoV1 {

    public void scan(String x) {
        // TODO 新增功能

        String result = x + x;

        // Show result in console"
        System.out.println(result);

        Invoker invoker = new Invoker();
        invoker.invoke();

        System.out.println(DemoUtil.x());
    }
}

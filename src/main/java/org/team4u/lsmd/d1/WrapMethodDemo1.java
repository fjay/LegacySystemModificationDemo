package org.team4u.lsmd.d1;

public class WrapMethodDemo1 {

    public void scan(String x) {
        addSomething(x);
        internalScan(x);
    }


    protected void addSomething(String x) {
        // 可使用TDD测试
    }

    private void internalScan(String x) {
        String result = x + x;

        // Show result in console"
        System.out.println(result);

        Invoker invoker = new Invoker();
        invoker.invoke();

        System.out.println(DemoUtil.x());
    }
}

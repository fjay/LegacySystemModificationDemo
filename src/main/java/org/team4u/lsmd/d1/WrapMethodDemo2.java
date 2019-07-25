package org.team4u.lsmd.d1;

public class WrapMethodDemo2 {

    public void scanWithAddSomthing(String x) {
        addSomething(x);
        scan(x);
    }


    protected void addSomething(String x) {
        // 可使用TDD测试
    }

    private void scan(String x) {
        String result = x + x;

        // Show result in console"
        System.out.println(result);

        Invoker invoker = new Invoker();
        invoker.invoke();

        System.out.println(DemoUtil.x());
    }
}

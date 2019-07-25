package org.team4u.lsmd.d1;

public class DemoV2 {

    private Display display;

    public DemoV2(Display display) {
        this.display = display;
    }

    public void scan(String x) {
        String result = x + x;

        display.show(result);

        new Invoker().invoke();

        x();

    }

    public void scan(Invoker invoker, String x) {
        String result = x + x;

        display.show(result);

        invoker.invoke();
    }

    protected void x() {
        // ...
    }
}
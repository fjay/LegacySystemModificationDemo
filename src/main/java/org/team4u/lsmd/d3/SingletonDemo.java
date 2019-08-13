package org.team4u.lsmd.d3;

public class SingletonDemo {

    private static SingletonDemo instance = new SingletonDemo();

    protected SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        return instance;
    }

    public static void setTestingInstance(SingletonDemo demo) {
        instance = demo;
    }

    public String x() {
        return "x";
    }
}

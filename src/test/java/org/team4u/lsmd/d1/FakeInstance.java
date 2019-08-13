package org.team4u.lsmd.d1;

import org.team4u.lsmd.d3.SingletonDemo;

public class FakeInstance extends SingletonDemo {

    @Override
    public String x() {
        return "fake";
    }
}

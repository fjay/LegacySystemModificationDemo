package org.team4u.lsmd.d1;

import org.junit.Assert;
import org.junit.Test;
import org.team4u.lsmd.d3.SingletonDemo;

public class Demo1Test {

    @Test
    public void testSuccessfulResult() {
        FakeDisplay display = new FakeDisplay();
        String x = "1";
        new DemoV2(display).scan(x);
        Assert.assertEquals(x + x, display.getResult());
    }

    @Test
    public void testSuccessfulResultWithoutInvoker() {
        FakeDisplay display = new FakeDisplay();
        String x = "1";
        new DemoV2(display).scan(new FakeInvoker(), x);
        Assert.assertEquals(x + x, display.getResult());
    }

    @Test
    public void testSuccessfulResultWithoutX() {

        FakeDisplay display = new FakeDisplay();
        String x = "1";
        new DemoV2(display) {
            @Override
            protected void x() {
            }
        }.scan(x);
        Assert.assertEquals(x + x, display.getResult());
    }

    @Test
    public void testFormatResultWithLowerCase() {
        String result = new DemoV2(null).formatResult("x");
        Assert.assertEquals("X", result);
        n
    }

    @Test
    public void instance() {
        SingletonDemo.setTestingInstance(new FakeInstance());
    }
}
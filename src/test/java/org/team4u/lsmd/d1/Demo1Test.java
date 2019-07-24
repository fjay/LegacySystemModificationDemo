package org.team4u.lsmd.d1;

import org.junit.Assert;
import org.junit.Test;

public class Demo1Test {

    @Test
    public void testSuccessfulResult() {
        FakeDisplay display = new FakeDisplay();
        String x = "1";
        new DemoV2(display).scan(x);
        Assert.assertEquals(x + x, display.getResult());
    }

    @Test
    public void testSuccessfulWithoutInvoker() {
        FakeDisplay display = new FakeDisplay();
        String x = "1";
        new DemoV2(display).scan(new FakeInvoker(), x);
        Assert.assertEquals(x + x, display.getResult());
    }
}
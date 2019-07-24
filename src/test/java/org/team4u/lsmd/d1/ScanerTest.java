package org.team4u.lsmd.d1;

import org.junit.Assert;
import org.junit.Test;

public class ScanerTest {

    @Test
    public void successfulScan() {
        FakeDisplay display = new FakeDisplay();
        String x = "1";
        new ScanerV2(display).scan(x);
        Assert.assertEquals(x + x, display.getResult());
    }
}
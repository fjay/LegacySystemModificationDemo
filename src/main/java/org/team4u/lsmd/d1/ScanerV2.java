package org.team4u.lsmd.d1;

public class ScanerV2 {

    private Display display;

    public ScanerV2(Display display) {
        this.display = display;
    }

    public void scan(String x) {
        String result = x + x;

        display.show(result);

        System.out.println("Do other things");
    }
}

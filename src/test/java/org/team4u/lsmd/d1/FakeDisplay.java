package org.team4u.lsmd.d1;

public class FakeDisplay implements Display {

    private String result;

    public void show(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}

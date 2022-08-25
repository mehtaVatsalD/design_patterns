package io.commoncoder.designpatterns.factorymethod.clean.monitor;

public class LCDMonitor implements Monitor {

    @Override
    public void display(String thing) {
        System.out.println("Displaying in on LCD monitor!");
        System.out.println(thing);
    }

}

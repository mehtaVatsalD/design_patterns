package io.commoncoder.designpatterns.factorymethod.clean.monitor;

public class LEDMonitor implements Monitor {

    @Override
    public void display(String thing) {
        System.out.println("Displaying in on LED monitor!");
        System.out.println(thing);
    }

}

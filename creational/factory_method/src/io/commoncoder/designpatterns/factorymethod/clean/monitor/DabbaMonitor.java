package io.commoncoder.designpatterns.factorymethod.clean.monitor;

public class DabbaMonitor implements Monitor {

    @Override
    public void display(String thing) {
        System.out.println("Displaying in on traditional dabba wala monitor!");
        System.out.println(thing);
    }
}

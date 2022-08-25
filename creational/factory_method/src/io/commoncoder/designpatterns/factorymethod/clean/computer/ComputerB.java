package io.commoncoder.designpatterns.factorymethod.clean.computer;

import io.commoncoder.designpatterns.factorymethod.clean.monitor.DabbaMonitor;
import io.commoncoder.designpatterns.factorymethod.clean.monitor.LCDMonitor;
import io.commoncoder.designpatterns.factorymethod.clean.monitor.Monitor;

public class ComputerB extends Computer {

    @Override
    protected Monitor getMonitor() {
        return new LCDMonitor();
    }
}

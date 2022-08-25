package io.commoncoder.designpatterns.factorymethod.clean.computer;

import io.commoncoder.designpatterns.factorymethod.clean.monitor.DabbaMonitor;
import io.commoncoder.designpatterns.factorymethod.clean.monitor.LEDMonitor;
import io.commoncoder.designpatterns.factorymethod.clean.monitor.Monitor;

public class ComputerC extends Computer {

    @Override
    protected Monitor getMonitor() {
        return new LEDMonitor();
    }
}

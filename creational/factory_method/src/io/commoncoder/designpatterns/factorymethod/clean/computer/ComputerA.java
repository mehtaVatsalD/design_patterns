package io.commoncoder.designpatterns.factorymethod.clean.computer;

import io.commoncoder.designpatterns.factorymethod.clean.monitor.DabbaMonitor;
import io.commoncoder.designpatterns.factorymethod.clean.monitor.Monitor;

public class ComputerA extends Computer {

    @Override
    protected Monitor getMonitor() {
        return new DabbaMonitor();
    }
}

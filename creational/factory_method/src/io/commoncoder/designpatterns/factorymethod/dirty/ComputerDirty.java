package io.commoncoder.designpatterns.factorymethod.dirty;

import io.commoncoder.designpatterns.factorymethod.clean.computer.Computer;

public class ComputerDirty {

    /**
     * In order for this computer to operate, it needs to output things to some monitor.
     * Hence, it creates instance of dirty monitor and calls display method.
     * <br/><br/>
     * But this dirty computer is tightly coupled with the concrete monitor instance!
     * i.e. {@link MonitorDirty} or {@link MonitorDirtyAnnother}
     * <br/><br/>
     * Every time other type of monitor is to be used, code in this method has to be changed.
     * <br/><br/>
     * See {@link Computer} to learn how to do this in cleaner way!
     */
    public void operate() {
        MonitorDirty monitor = new MonitorDirty();

//        Need to change code like this everytime new instance is needed
//        MonitorDirtyAnnother monitor = new MonitorDirtyAnnother();
        monitor.display("Yikes!");
    }


}

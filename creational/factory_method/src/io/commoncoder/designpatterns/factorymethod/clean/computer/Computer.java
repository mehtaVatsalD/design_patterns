package io.commoncoder.designpatterns.factorymethod.clean.computer;

import io.commoncoder.designpatterns.factorymethod.clean.monitor.DabbaMonitor;
import io.commoncoder.designpatterns.factorymethod.clean.monitor.LCDMonitor;
import io.commoncoder.designpatterns.factorymethod.clean.monitor.LEDMonitor;
import io.commoncoder.designpatterns.factorymethod.clean.monitor.Monitor;

public abstract class Computer {

    /**
     * In order for this computer to operate, it needs to output things to some monitor.
     * But, instead of tightly coupling with specific type of monitor, it asks for instance of monitor from factory method {@link #getMonitor()}
     * <br/><br/>
     * Hence, this method is not tightly coupled with any monitor instance.
     */
    public void operate() {
        Monitor monitor = getMonitor();
        monitor.display("Factory Method...");
    }

    /**
     * This method is kept abstract and is <strong>Factory Method</strong>. So any extending computer class will have option to chose which monitor they want while operating!!
     * See {@link Monitor}, it is interface.
     * <br/><br/>
     * Hence, any new monitor comes in market (like {@link DabbaMonitor}, {@link LCDMonitor}, {@link LEDMonitor}), it will implement that interface.
     * And any new computer that wants to use it will extend from this class and provide implementation of this method which will return instace of that new monitor
     * <br/><br/>
     * See example implementations {@link ComputerA}, {@link ComputerB}, {@link ComputerC}
     * @return instance of {@link Monitor}
     */
    protected abstract Monitor getMonitor();

}

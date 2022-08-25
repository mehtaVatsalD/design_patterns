package io.commoncoder.designpatterns.factorymethod;

import io.commoncoder.designpatterns.factorymethod.clean.computer.Computer;
import io.commoncoder.designpatterns.factorymethod.clean.computer.ComputerA;
import io.commoncoder.designpatterns.factorymethod.clean.computer.ComputerB;
import io.commoncoder.designpatterns.factorymethod.clean.computer.ComputerC;
import io.commoncoder.designpatterns.factorymethod.dirty.ComputerDirty;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------DIRTY COMPUTER--------------------");
        ComputerDirty computerDirty = new ComputerDirty();
        computerDirty.operate();

        System.out.println("--------------------COMPUTER-A WITH DABBA MONITOR--------------------");

        Computer computerA = new ComputerA();
        computerA.operate();

        System.out.println("--------------------DIRTY COMPUTER-B WITH LCD MONITOR--------------------");

        Computer computerB = new ComputerB();
        computerB.operate();

        System.out.println("--------------------DIRTY COMPUTER-C WITH LED MONITOR--------------------");

        Computer computerC = new ComputerC();
        computerC.operate();

    }
}

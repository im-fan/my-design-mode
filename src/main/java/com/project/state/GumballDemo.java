package com.project.state;

public class GumballDemo {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(3);
        machine.insertQuarter();
        machine.dispense();
        machine.turnCrank();
        machine.ejectQuarter();
    }

}

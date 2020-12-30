package com.project.state;

public class GumballDemo {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(1);
        //第一次买糖-成功
        machine.insertQuarter();
        machine.turnCrank();
        machine.dispense();

        System.out.println("剩余糖果===》"+machine.getCandyCount());
        //第二次买糖-失败
        machine.insertQuarter();
        machine.turnCrank();
        machine.dispense();
        machine.ejectQuarter();

    }

}

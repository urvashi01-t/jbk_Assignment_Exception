package com.Exception;

public class HouseKeeping extends Employee {

    public HouseKeeping(int employeeId, String name, double salary,String task,int rate) {
        super(employeeId, name, salary," ",0);
    }
    public void cleanRoom(int roomNumber) {
        System.out.println(getName() + " saff kar yeh wla " + roomNumber + ".");
    }
}

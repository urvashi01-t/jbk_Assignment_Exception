package com.Exception;

public class FrontDesk extends Employee {
    public FrontDesk(int employeeId, String name, double salary, String task,int rate) {
        super(employeeId, name, salary," ",rate=0);
    }
    public void checkInGuests(int guests) {
        System.out.println(getName() + " check in ho gaya " + guests + " guests.");
    }
}

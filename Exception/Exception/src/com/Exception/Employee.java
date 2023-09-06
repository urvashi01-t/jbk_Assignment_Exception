package com.Exception;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String task;

    private int taskRate;

    public Employee(int employeeId, String name, double salary, String task, int taskRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public String getTask() {
        return task;
    }

    public int getTaskRate() {
        return taskRate;
    }

    public void setTaskRate(int taskRate) {
        this.taskRate = taskRate;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        if (getTaskRate() > 60 && getTaskRate() <= 100) {
            return "Employee{" +
                    "employeeId=" + employeeId +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", task='" + task + '\'' +
                    ", taskRate=" + taskRate +
                    " task almost completed" +
                    '}';
        }
        else {
            return "Employee{" +
                    "employeeId=" + employeeId +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", task='" + task + '\'' +
                    ", taskRate=" + taskRate +
                    " task is about to start" +
                    '}';
        }
    }
}
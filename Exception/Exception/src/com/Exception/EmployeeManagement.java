package com.Exception;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;

public class EmployeeManagement {
    HashMap<Integer, FrontDesk> frontDeskHashMap = new HashMap<>();
    HashMap<Integer, HouseKeeping> houseKeepingHashMap = new HashMap<>();
    HashMap<Integer, KitchenStaff> kitchenStaffHashMap = new HashMap<>();

    public void hireEmployee(String category, int employeeId, String name, double salary, int rate) throws KuchPhireSeMilaException {
        try {
            if (category.equals("1")) {
                if (frontDeskHashMap.containsKey(employeeId)) {
                    throw new KuchPhireSeMilaException("Employee with ID " + employeeId + " already exists.");
                } else {
                    FrontDesk d = new FrontDesk(employeeId, name, salary, "", rate);
                    frontDeskHashMap.put(employeeId, d);
                }
            } else if (category.equals("2")) {
                if (houseKeepingHashMap.containsKey(employeeId)) {
                    throw new KuchPhireSeMilaException("Employee with ID " + employeeId + " already exists.");
                } else {
                    HouseKeeping d = new HouseKeeping(employeeId, name, salary, "", rate);
                    houseKeepingHashMap.put(employeeId, d);
                }            }
            else if (category.equals("3")) {
                if (kitchenStaffHashMap.containsKey(employeeId)) {
                    throw new KuchPhireSeMilaException("Employee with ID " + employeeId + " already exists.");
                } else {
                    KitchenStaff d = new KitchenStaff(employeeId, name, salary, "", rate);
                    kitchenStaffHashMap.put(employeeId, d);
                }
            } else {
                System.out.println("Invalid category.");
            }
        } catch (InputMismatchException e) {
            System.err.println("An error occurred while hiring an employee: " + e.getMessage());
        }
    }

    public void fireEmployee(String category, int employeeId) throws EmployeeNhiMilaException {
        try {
            if (category.equals("1")) {
                if (!frontDeskHashMap.containsKey(employeeId)) {
                    throw new EmployeeNhiMilaException("Employee with ID " + employeeId + " not found.");
                }
                frontDeskHashMap.remove(employeeId);
            } else if (category.equals("2")) {
                if (!houseKeepingHashMap.containsKey(employeeId)) {
                    throw new EmployeeNhiMilaException("Employee with ID " + employeeId + " not found.");
                }
                houseKeepingHashMap.remove(employeeId);
            } else if (category.equals("3")) {
                if (!kitchenStaffHashMap.containsKey(employeeId)) {
                    throw new EmployeeNhiMilaException("Employee with ID " + employeeId + " not found.");
                }
                kitchenStaffHashMap.remove(employeeId);
            } else {
                System.out.println("Invalid category.");
            }
        } catch (Exception e) {
            System.err.println("An error occurred while firing an employee: " + e.getMessage());
        }
    }


    public void updateEmployee(String category,int id,String name,double salary,String task,int rate){
        try {
            if (category.equals("1")) {
                frontDeskHashMap.get(id).setName(name);
                frontDeskHashMap.get(id).setTask(task);
                frontDeskHashMap.get(id).setSalary(salary);
                frontDeskHashMap.get(id).setTaskRate(rate);

            } else if (category.equals("2")) {
                houseKeepingHashMap.get(id).setName(name);
                houseKeepingHashMap.get(id).setTask(task);
                houseKeepingHashMap.get(id).setSalary(salary);
                houseKeepingHashMap.get(id).setTaskRate(rate);

            } else if (category.equals("3")) {
                kitchenStaffHashMap.get(id).setName(name);
                kitchenStaffHashMap.get(id).setTask(task);
                kitchenStaffHashMap.get(id).setSalary(salary);
                kitchenStaffHashMap.get(id).setTaskRate(rate);

            } else {
                System.out.println("NOT FOUND ");
            }
        }catch (Exception e){
            System.out.println("An error occurred while firing an employee: " + e.getMessage());
        }
    }
    public void assignTask(String category,int employeId,String task,int rate) {
//            int rate1= taskCompleted(rate)
        try {
            if (category.equals("1")) {
                frontDeskHashMap.get(employeId).setTask(task);
                frontDeskHashMap.get(employeId).setTaskRate(rate);
            } else if (category.equals("2")) {
                houseKeepingHashMap.get(employeId).setTask(task);
                houseKeepingHashMap.get(employeId).setTaskRate(rate);
            } else if (category.equals("3")) {
                kitchenStaffHashMap.get(employeId).setTask(task);
                kitchenStaffHashMap.get(employeId).setTaskRate(rate);
            } else {
                System.out.println("NOT FOUND ");
            }
        }catch (Exception e){
            System.out.println("An error occurred while firing an employee: " + e.getMessage());
        }
    }
    public void report(String category) {
        try {


            if (category.equals("1")) {
                Iterator<Map.Entry<Integer, FrontDesk>> iterator = frontDeskHashMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, FrontDesk> entry = iterator.next();
                    Integer key = entry.getKey();
                    String value = String.valueOf(entry.getValue());
                    System.out.println("Key: " + key + ", Value: " + value);
                }
            } else if (category.equals("2")) {
                Iterator<Map.Entry<Integer, HouseKeeping>> iterator = houseKeepingHashMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, HouseKeeping> entry = iterator.next();
                    Integer key = entry.getKey();
                    String value = String.valueOf(entry.getValue());
                    System.out.println("Key: " + key + ", Value: " + value);
                }
            } else if (category.equals("3")) {
                Iterator<Map.Entry<Integer, KitchenStaff>> iterator = kitchenStaffHashMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, KitchenStaff> entry = iterator.next();
                    Integer key = entry.getKey();
                    String value = String.valueOf(entry.getValue());
                    System.out.println("Key: " + key + ", Value: " + value);
                }
            } else {
                System.out.println("NOT FOUND ");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while firing an employee: " + e.getMessage());
        }
    }
}

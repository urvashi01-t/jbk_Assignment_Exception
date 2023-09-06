package com.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement hotelSystem = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Hotel Management System");
                System.out.println("1. Hire Employee");
                System.out.println("2. Fire Employee");
                System.out.println("3. Update Employee Details");
                System.out.println("4. Assign Task");
                System.out.println("5. Report");
                System.out.print("Enter your choice: ");
                String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Type");
                    System.out.println("1. Front Desk");
                    System.out.println("2. House Keeping");
                    System.out.println("3. Kitchen Staff");
                    System.out.println("Enter type");
                    String category = scanner.nextLine();
                    System.out.println("Enter employee id");
                    int id = scanner.nextInt();
                    System.out.println("Enter name");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Enter Salary");
                    Double salary = scanner.nextDouble();
                    scanner.nextLine();
                    hotelSystem.hireEmployee(category, id, name, salary, 0);
                    break;
                case "2":
                    System.out.println("Type");
                    System.out.println("1. Front Desk");
                    System.out.println("2. House Keeping");
                    System.out.println("3. Kitchen Staff");
                    System.out.println("Enter type");
                    String category1 = scanner.nextLine();
                    System.out.println("Enter employee id");
                    int id1 = scanner.nextInt();
                    hotelSystem.fireEmployee(category1, id1);
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.println("Type");
                    System.out.println("1. Front Desk");
                    System.out.println("2. House Keeping");
                    System.out.println("3. Kitchen Staff");
                    System.out.println("Enter type");
                    String category2 = scanner.nextLine();
                    System.out.println("Enter employee id");
                    int id4 = scanner.nextInt();
                    System.out.println("Enter name");
                    scanner.nextLine();
                    String name1 = scanner.nextLine();
                    System.out.println("Enter Salary");
                    Double salary1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("task");
                    String task = scanner.nextLine();
                    System.out.println("task rate");
                    int rate = scanner.nextInt();
                    scanner.nextLine();
                    hotelSystem.updateEmployee(category2, id4, name1, salary1, task, 100);
                    break;
                case "4":
                    System.out.println("Type");
                    System.out.println("1. Front Desk");
                    System.out.println("2. House Keeping");
                    System.out.println("3. Kitchen Staff");
                    System.out.println("Enter type");
                    String category3 = scanner.nextLine();
                    System.out.println("id ");
                    int id3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Task");
                    String task1 = scanner.nextLine();
                    System.out.println("task rate");
                    int rate2 = scanner.nextInt();
                    hotelSystem.assignTask(category3, id3, task1, rate2);
                    break;

                case "5":
                    System.out.println("Type");
                    System.out.println("1. Front Desk");
                    System.out.println("2. House Keeping");
                    System.out.println("3. Kitchen Staff");
                    System.out.println("Enter type");
                    String category6 = scanner.nextLine();
                    hotelSystem.report(category6);
                    break;
                default:
                    System.out.println("invalid input");
            }
            } catch (Exception e) {
                System.err.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
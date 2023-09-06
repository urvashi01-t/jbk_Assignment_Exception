package com.Exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        RoomCheck reservation = new RoomCheck();

        while (true) {
            System.out.println("1 : Make Reservation");
            System.out.println("2 : Check Availability");
            System.out.println("3 : Unreserve");
            System.out.println("4 : Exit");

            int choice = -1;
            try {
                choice = scan.nextInt();
            } catch (InputMismatchException e) {
            }

            scan.nextLine();

            switch (choice) {
                case 1:
                    makeReservation(scan, reservation);
                    break;
                case 2:
                    checkAvailability(reservation);
                    break;
                case 3:
                    unReserve(scan, reservation);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
            }
        }


    }

    public static void makeReservation(Scanner scan, RoomCheck res) {
        try {
            System.out.println("Enter reservation type (Room, EventHall, SpaServices)");
            String type = scan.nextLine();

            int doorNumber = -1;
            System.out.println("Enter door no");
            if (scan.hasNextInt()) {
                doorNumber = scan.nextInt();
                scan.nextLine();
            } else {
                throw new InputMismatchException("Invalid door number format. Please enter a valid integer.");
            }

            System.out.println("Enter name");
            String name = scan.nextLine();

            System.out.println("Enter contact number");
            long phone = -1;
            if (scan.hasNextLong()) {
                phone = scan.nextLong();
                scan.nextLine();
            } else {
                throw new InputMismatchException("Invalid contact number format. Please enter a valid long.");
            }

            Guest guest = new Guest(name, phone);
            String roomType = null;

            if (type.equals("Room")) {
                System.out.println("Enter room type (Standard, Deluxe, Suite)");
                roomType = scan.nextLine();
            }

            res.makeReservation(type, doorNumber, guest, roomType);
        }
        catch (InputMismatchException | InvalidReservationException | RoomNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            res.availability();
        }
    }


    public static void checkAvailability(RoomCheck res) {
        res.availability();
    }

    public static void unReserve(Scanner scan, RoomCheck res) {
        try {
            System.out.println("Enter reservation type (Room, EventHall, SpaServices)");
            String type = scan.nextLine();

            int doorNumber = -1;
            System.out.println("Enter door no");

            if (scan.hasNextInt()) {
                doorNumber = scan.nextInt();
                scan.nextLine();
            } else {
                throw new InputMismatchException("Invalid door number format. Please enter a valid integer.");
            }

            res.unReservation(type, doorNumber);
        }
        catch (InputMismatchException | RoomNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            res.availability();
        }
    }




}

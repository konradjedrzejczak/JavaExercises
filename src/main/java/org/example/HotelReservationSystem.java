package org.example;

import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of hotel room");
        int numberOfRooms = scan.nextInt();
        Hotel hotel = new Hotel(numberOfRooms);

        while (true) {
            System.out.println("\n1. Reserve a room");
            System.out.println("2. Release a room");
            System.out.println("3. Display room status");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the room number to reserve: ");
                    int reserveRoomNumber = scan.nextInt();
                    hotel.reserveRoom(reserveRoomNumber);
                    break;
                case 2:
                    System.out.print("Enter the room number to release: ");
                    int releaseRoomNumber = scan.nextInt();
                    hotel.releaseRoom(releaseRoomNumber);
                    break;
                case 3:
                    hotel.displayRoomStatus();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

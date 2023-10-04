package org.example;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();

    public Hotel(int numberOfRooms) {
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public boolean reserveRoom (int roomNumber){
        Room room = findRoom(roomNumber);
        if (room != null && !room.isReserved()){
            room.reserve();
            System.out.println("Room" + roomNumber + "Reserved succesfully");
            return true;
        }else{
            System.out.println("Room" + roomNumber + "is not available");
            return false;
        }
    }

    public boolean releaseRoom(int roomNumber){
        Room room = findRoom(roomNumber);
        if (room != null && room.isReserved()){
            room.release();
            System.out.println("Room" + roomNumber + "released succesfully");
            return true;
        }else{
            System.out.println("Room" + roomNumber + "is not reserved");
            return false;
        }
    }

    private Room findRoom(int roomNumber){
        for (Room room : rooms) {
        if (room.getRoomNumber() == roomNumber) {
            return room;
        }
    }
        return null;
    }

    public void displayRoomStatus(){
        System.out.println("Room status");
        for (Room rooms : rooms){
            System.out.println("ROom" + rooms.getRoomNumber() +
                    ": " + (rooms.isReserved() ? "Reserved" : "Availalbe"));
        }
    }
}

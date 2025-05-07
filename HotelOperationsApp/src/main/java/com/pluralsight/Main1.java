package com.pluralsight;

import Employee.Employee1;
import Reservation.Reservation1;
import Room.Room1;

public class Main1 {
    public static void main(String[] args) {
        Room1 room = new Room1(4, 1200, true, true);
        Reservation1 reservation = new Reservation1(Reservation1.RoomType.KING, 2000, 3, true);
        Employee1 employee = new Employee1("YU357", "Randy Imbia", "AFE2", 18.50, 120.0);
        System.out.println(employee.getTotalPay());
        System.out.println(employee.getRegularHour());
        System.out.println(employee.getOvertimeHours());
        System.out.println(reservation.getRoomType());
        System.out.println(room.getNumberOfBeds());
    }
}

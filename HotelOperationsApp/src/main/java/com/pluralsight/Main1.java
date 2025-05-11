package com.pluralsight;

import Employee.Employee1;
import Reservation.Reservation1;
import Room.Room1;

public class Main1 {
    public static void main(String[] args) {
        Room1 room = new Room1(4, 1200, false, false);
        Reservation1 reservation = new Reservation1(Reservation1.RoomType.KING, 2, true);
//        Optional
//        Reservation1 reservation = new Reservation1();
//        reservation.setRoomType(Reservation1.RoomType.KING);
//        reservation.setNumberOfNights(2);
//        reservation.setWeekend(true);
        Employee1 employee = new Employee1("YU357", "Randy Imbia", "AFE2", 18.50, 120.0);
//        System.out.println("Total Pay: " + employee.getTotalPay());
//        System.out.println("Regular Hours: " + employee.getRegularHour());
//        System.out.println("Overtime: " + employee.getOvertimeHours());
        System.out.println("PunchIn: " + employee.punchIn());
        System.out.println("PunchOut: " + employee.punchOut());
//        employee.punchTimeCard();
//        System.out.println("PunchTimeCard: " + employee.getHoursWorked());
//        System.out.println("Room Type: " + reservation.getRoomType());
//        System.out.println("Room Price: " + reservation.getReservationTotal());
//        System.out.println("Number of Beds: " + room.getNumberOfBeds());
//        System.out.println("Checkin: " + room.checkin(true));
//        System.out.println("Checkout: " + room.checkout(true));
//        System.out.println("Clean Room: " + room.cleanroom(true));
    }
}

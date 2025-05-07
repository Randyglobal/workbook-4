//package Reservation;
//
//public class Reservation {
//    public enum RoomType{
//        KING, DOUBLE
//    }
//    private RoomType roomType;
//    private double price = 0.0;
//    private int numberOfNights = 0;
//    private boolean isWeekend = false;
//    private double reservationTotal = 0.0;
//
//    public Reservation(RoomType roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
//        this.roomType = roomType;
//        this. price = price;
//        this.numberOfNights = numberOfNights;
//        this.isWeekend = isWeekend;
//        this.reservationTotal = reservationTotal;
//    }
//
//    public RoomType getRoomType() {
//        return roomType;
//    }
//
//    public void setRoomType(RoomType roomType) {
//        this.roomType = roomType;
//        this.price = totalPrice();
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getNumberOfNights() {
//        return numberOfNights;
//    }
//
//    public void setNumberOfNights(int numberOfNights) {
//        this.numberOfNights = numberOfNights;
//    }
//
//    public boolean isWeekend() {
//        return isWeekend;
//    }
//
//    public void setWeekend(boolean weekend) {
//        isWeekend = weekend;
//        price = totalPrice();
//    }
//    public double totalPrice(){
//        double roomPrice;
//        switch (roomType){
//            case KING -> roomPrice = 139.00;
//            case DOUBLE -> roomPrice = 124.00;
//            default -> roomPrice = 0.0;
//        }
//        if (isWeekend){
//            roomPrice *= 1.10;
//        }
//        return roomPrice;
//    }
//
//    public double getReservationTotal() {
//        return price * numberOfNights;
//    }
//
//    public void setReservationTotal(double reservationTotal) {
//        this.reservationTotal = price * numberOfNights;
//    }
//}

package Reservation;

public class Reservation1 {
    public enum RoomType{
        KING, DOUBLE
    }
    private RoomType roomType;
    private double price = 0.0;
    private int numberOfNights = 0;
    private boolean isWeekend = false;
    private double reservationTotal = 0.0;

//    Optional
//    public Reservation1() {
//    }

    public Reservation1(RoomType roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double totalPay(){
        switch (roomType){
            case KING -> price = 139.00 * numberOfNights;
            case DOUBLE -> price = 1245.00 * numberOfNights;
        }
        if (isWeekend){
           price *= 1.10;
        }
        return price;
    }
    public double getReservationTotal() {
        return totalPay();
    }


}

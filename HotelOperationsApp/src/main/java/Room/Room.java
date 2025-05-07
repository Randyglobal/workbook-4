//package Room;
//
//public class Room {
//    private int numberOfBeds = 0;
//    private double price = 0;
//    private boolean isOccupied = false;
//    private boolean isDirty = false;
//    private boolean isAvailable = false;
//
//    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
//        this.numberOfBeds = numberOfBeds;
//        this.price = price;
//        this.isOccupied =  isOccupied;
//        this.isDirty = isDirty;
//    }
//
//    public int getNumberOfBeds() {
//        return numberOfBeds;
//    }
//
//    public void setNumberOfBeds(int numberOfBeds) {
//        this.numberOfBeds = numberOfBeds;
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
//    public boolean isOccupied() {
//        return isOccupied;
//    }
//
//    public void setOccupied(boolean occupied) {
//        isOccupied = occupied;
//    }
//
//    public boolean isDirty() {
//        return isDirty;
//    }
//
//    public void setDirty(boolean dirty) {
//        isDirty = dirty;
//    }
//
//    public boolean isAvailable() {
//        return !isDirty && !isOccupied;
//    }
//
//    public void setAvailable(boolean available) {
//        isAvailable = !isDirty && !isOccupied;
//    }
//
//    public void checkIn(boolean isPaid){
//        if (isAvailable() && isPaid){
//            isOccupied = true;
//            isDirty = true;
//        }else if (!isAvailable()){
//            System.out.println("Room is not available");
//        }else{
//            System.out.println("Payment needed");
//        }
//    }
//    public void checkout(){
//        isDirty = true;
//        isOccupied = false;
//
//    }
//    public void clean(){
//        isDirty = true;
//    }
//}

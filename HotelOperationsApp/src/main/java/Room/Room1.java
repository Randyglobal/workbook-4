package Room;

public class Room1 {
    private int numberOfBeds = 0;
    private double price = 0;
    private boolean isOccupied = false;
    private boolean isDirty = false;
    private boolean isAvailable = false;

    public Room1(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
//    Checking if room is available and paid before proceeding
    public boolean checkin(boolean isPaid){
        if (isAvailable() && isPaid){
            System.out.println("Room has been checked, This means: " + "\n" + "Occupied: " + !isOccupied + "\n" + "and it is Dirty " + !isDirty );
        }else{
            System.out.println("I am sorry, you have to pay first");
        }
        return isPaid;
    }
    public boolean checkout(boolean isAvailable){
        if (isAvailable()){
            System.out.println("Room has been checkout, This means: " + "\n" + "Occupied: " + isOccupied + "\n" + "and it is Dirty" + !isDirty );
        }
        return isAvailable;
    }
    public boolean cleanroom(boolean isAvailable){
        if (isAvailable()){
            System.out.println("It is Dirty" + !isDirty );
        }
        return isAvailable;
    }
}

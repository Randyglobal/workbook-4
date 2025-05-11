package Hotel;

public class Hotel {
    private String name = "";
    private int numberOfSuites = 0;
    private int numberOfRooms = 0;
    private int bookedSuites = 0;
    private int bookedBasicRooms =  0;

//    Constructor 1
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;

    }

//    Constructor2
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }
    public int getAvailableRooms(){
        int numberOfBookedRooms = bookedSuites + bookedBasicRooms;
        return numberOfRooms - numberOfBookedRooms;
    }

    public static boolean bookedRoom(int numberOfRooms, boolean isSuite){
        if (numberOfRooms > 0 && isSuite){
            boolean result = true;
            return result;
        }else{
            boolean result = false;
            return result;
        }
    }
}

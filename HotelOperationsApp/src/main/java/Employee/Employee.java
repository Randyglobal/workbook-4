//package Employee;
//
//public class Employee {
//    private String employeeId = "";
//    private String name = "";
//    private String department = "";
//    private double payRate = 0;
//    private double hoursWorked = 0;
//    private double punchInTime = 0.0;
//    private double punchOutTime = 0.0;
//
//    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked, double punchInTime, double punchOutTime) {
//      this.employeeId = employeeId;
//      this.name = name;
//      this.department = department;
//      this.payRate = payRate;
//      this.hoursWorked = hoursWorked;
//      this.punchInTime = punchInTime;
//      this.punchOutTime = punchOutTime;
//    }
//
//    public String getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(String employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public double getPayRate() {
//        return payRate;
//    }
//
//    public void setPayRate(double payRate) {
//        this.payRate = payRate;
//    }
//
//    public double getHoursWorked() {
//        return hoursWorked;
//    }
//
//    public void setHoursWorked(double hoursWorked) {
//        this.hoursWorked = hoursWorked;
//    }
//    public double getTotalPay(){
//        return hoursWorked * payRate;
//    }
//
//    public double getPunchInTime() {
//        return punchInTime;
//    }
//
//    public void setPunchInTime(double punchInTime) {
//        this.punchInTime = punchInTime;
//    }
//
//    public double getPunchOutTime() {
//        return punchOutTime;
//    }
//
//    public void setPunchOutTime(double punchOutTime) {
//        this.punchOutTime = punchOutTime;
//    }
//
//    public double getRegularHours(){
//        double regularHours = 0;
//        if (hoursWorked > 40){
//            regularHours = 40;
//        }
//        return  regularHours;
//    }
//    public  double getOverTimeHours(){
//        double overtimeHours = 0;
//        if (hoursWorked > 40){
//            overtimeHours = hoursWorked - getRegularHours();
//        }
//        return overtimeHours;
//    }
////    public void punchIn(double time){
////        punchInTime = time;
////    }
//    public void punchTimeCart(){
//        double totalHoursWorked = punchOutTime - punchInTime;
//        if (totalHoursWorked > 0){
//            hoursWorked += totalHoursWorked;
//        }else{
//            System.out.println("Invalid Code");
//        }
//    }
//}

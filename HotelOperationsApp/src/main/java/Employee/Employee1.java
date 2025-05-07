package Employee;

public class Employee1 {
    private String employeeId = "";
    private String name = "";
    private String department = "";
    private double payRate = 0;
    private double hoursWorked = 0;
    private double regularHour = 40;

    public Employee1( String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getTotalPay(){
        return hoursWorked * payRate;
    }
    public double getRegularHour(){
       if (hoursWorked > regularHour){
            System.out.println("This is regular hour for employees" + regularHour);
        }
        return regularHour;
    }
    public double getOvertimeHours(){
        return hoursWorked - regularHour;
    }
}

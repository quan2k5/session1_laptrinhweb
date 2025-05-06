
package model;
public class Student {
    private String fullName;
    private String className;
    private String vehicleType;
    private String plate;
    public Student(String fullName, String className, String vehicleType, String plate) {
        this.fullName = fullName;
        this.className = className;
        this.vehicleType = vehicleType;
        this.plate = plate;
    }
    public String getFullName() {
        return fullName;
    }
    public String getClassName() {
        return className;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getPlate() {
        return plate;
    }
}
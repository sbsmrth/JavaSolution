package model;

public class RailVehicle {
    private int id;
    private String manufacturer;
    private int numWheels;
    private CouplerType couplerType;

    public RailVehicle(int id, String manufacturer, int numWheels, CouplerType couplerType) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.numWheels = numWheels;
        this.couplerType = couplerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public CouplerType getCouplerType() {
        return couplerType;
    }

    public void setCouplerType(CouplerType couplerType) {
        this.couplerType = couplerType;
    }
}

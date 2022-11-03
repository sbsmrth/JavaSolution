package model;

public class Locomotive extends RailVehicle {
    private MotorType motorType;

    public Locomotive(int id, String manufacturer, int numWheels, CouplerType couplerType, MotorType motorType) {
        super(id, manufacturer, numWheels, couplerType);
        this.motorType = motorType;
    }

    public MotorType getMotorType() {
        return motorType;
    }

    public void setMotorType(MotorType motorType) {
        this.motorType = motorType;
    }
}

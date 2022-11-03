package model;

public class RailroadCar extends RailVehicle {
    private double speed;
    private char speedType;

    public RailroadCar(int id, String manufacturer, int numWheels, CouplerType couplerType, double speed, char speedType) {
        super(id, manufacturer, numWheels, couplerType);
        this.speed = speed;
        this.speedType = speedType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public char getSpeedType() {
        return speedType;
    }

    public void setSpeedType(char speedType) {
        this.speedType = speedType;
    }
}

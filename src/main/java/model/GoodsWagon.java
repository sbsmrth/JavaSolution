package model;

public class GoodsWagon extends RailroadCar {

    private CargoType cargoType;

    public GoodsWagon(int id, String manufacturer, int numWheels, CouplerType couplerType, double speed, char speedType, CargoType cargoType) {
        super(id, manufacturer, numWheels, couplerType, speed, speedType);
        this.cargoType = cargoType;

    }

    public CargoType getCargoType() {
        return cargoType;
    }

    public void setCargoType(CargoType cargoType) {
        this.cargoType = cargoType;
    }
}

package model;

import java.util.ArrayList;

public class Train {

    private ArrayList<Locomotive> locomotives;
    private ArrayList<RailroadCar> railroadCars;
    private int id;
    public Train(int id) {
        locomotives = new ArrayList<>();
        railroadCars = new ArrayList<>();
        this.id = id;
    }

    public ArrayList<Locomotive> getLocomotives() {
        return locomotives;
    }

    public void addLocomotive(Locomotive locomotive) {
        if(locomotives.size() < 2) {
            locomotives.add(locomotive);
        }
    }

    public ArrayList<RailroadCar> getRailroadCars() {
        return railroadCars;
    }

    public void addRailroadCar(RailroadCar railroadCar) {
        railroadCars.add(railroadCar);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getLocalChairs() {
        int totalChairs = 0;
        for(RailroadCar railroadCar : railroadCars) {
            if(railroadCar instanceof PassengersCar) {
                PassengersCar passengersCar = (PassengersCar) railroadCar;
                totalChairs += passengersCar.getTotalChairs();
            }
        }
        return totalChairs;
    }

    public boolean isElectric() {
       for(Locomotive locomotive : locomotives) {
           if(locomotive.getMotorType() == MotorType.ELECTRIC) {
               return true;
           }
       }
       return false;
    }

    public int getNumOfCargoType(CargoType cargoType) {
        int nums = 0;
        for(RailroadCar railroadCar : railroadCars) {
            if(railroadCar instanceof GoodsWagon) {
                GoodsWagon goodsWagon = (GoodsWagon) railroadCar;
                if(goodsWagon.getCargoType() == cargoType) {
                    nums++;
                }
            }
        }
        return nums;
    }

    public int getNumOfCars() {

        int nums = 0;

        for(RailroadCar railroadCar : railroadCars) {
            if(railroadCar instanceof PassengersCar) {
                nums++;
            }
        }

        return nums;
    }

    @Override
    public String toString() {
        return String.format("id: %s", id);
    }
}

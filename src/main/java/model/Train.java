package model;

import java.util.ArrayList;

public class Train {

    private ArrayList<Locomotive> locomotives;
    private ArrayList<RailroadCar> railroadCars;
    private int id;

    public Train() {
        locomotives = new ArrayList<>();
        railroadCars = new ArrayList<>();
    }

    public Train(int id, ArrayList<Locomotive> locomotives, ArrayList<RailroadCar> railroadCars) {
        this.id = id;
        this.locomotives = locomotives;
        this.railroadCars = railroadCars;
    }

    public ArrayList<Locomotive> getLocomotives() {
        return locomotives;
    }

    public void setLocomotives(ArrayList<Locomotive> locomotives) {
        this.locomotives = locomotives;
    }

    public ArrayList<RailroadCar> getRailroadCars() {
        return railroadCars;
    }

    public void setRailroadCars(ArrayList<RailroadCar> railroadCars) {
        this.railroadCars = railroadCars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getTrainChairs() {
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
}

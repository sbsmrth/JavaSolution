package model;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class Enterprise {
    private String id;
    private String name;

    private ArrayList<Train> trains;

    public Enterprise(String id, String name, ArrayList<Train> trains) {
        this.id = id;
        this.name = name;
        this.trains = trains;
    }
    public Enterprise() {
        trains = new ArrayList<>();
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public ArrayList<Train> listOfElectricTrains() {
        ArrayList<Train> electricTrains = new ArrayList<>();

        for(Train train : trains) {
            if(train.isElectric() && train.getNumOfCargoType(CargoType.CAGE) == 3
            && train.getNumOfCargoType(CargoType.TANK) >= 1 && train.getNumOfCars() == 0) {
                electricTrains.add(train);
            }
        }

        return electricTrains;
    }
}

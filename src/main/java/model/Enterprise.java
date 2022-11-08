package model;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Date;

public class Enterprise {
    private String id;
    private String name;

    private ArrayList<Train> trains;

    public Enterprise(String id, String name) {
        trains = new ArrayList<>();
        this.id = id;
        this.name = name;
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

    public void addTrain(Train train) {
        trains.add(train);
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
    public Train exitsTrain(int id) {
        for(Train train : trains) {
            if(train.getId() == id) {
                return train;
            }
        }
        return null;
    }

    public int getChairsForTrain(int id) {
        Train train = exitsTrain(id);
        if(exitsTrain(id) != null) {
            return train.getLocalChairs();
        }
        return 0;
    }
}

import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Locomotive> locomotives = new ArrayList<>();
        ArrayList<RailroadCar> railroadCars = new ArrayList<>();
        ArrayList<Train> trains = new ArrayList<>();

        Train train = new Train(1234, locomotives, railroadCars);

        trains.add(train);

        Enterprise enterprise = new Enterprise("100.100.100-3", "Super Train", trains);

        locomotives.add(new Locomotive(123, "sjajs", 4, CouplerType.MANUAL, MotorType.ELECTRIC));

        PassengersCar passengersCar = new PassengersCar(12421, "cualquiera", 5, CouplerType.AUTOMATIC, 500377, 'A', 4, 3);

        railroadCars.add(passengersCar);



        System.out.println(train.getTrainChairs());

        System.out.println("El tren es electrico: " + train.isElectric());
    }
}
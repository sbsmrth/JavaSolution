import model.*;

import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Locomotive> locomotives = new ArrayList<>();
        ArrayList<RailroadCar> railroadCars = new ArrayList<>();
        ArrayList<Train> trains = new ArrayList<>();

        GoodsWagon goodsWagon = new GoodsWagon(96978, "manufacturer1", 5, CouplerType.AUTOMATIC, 457.39, 'C', CargoType.TANK);

        GoodsWagon goodsWagon2 = new GoodsWagon(92178, "manufacturer1", 5, CouplerType.AUTOMATIC, 497.19, 'C', CargoType.CAGE);
        GoodsWagon goodsWagon3 = new GoodsWagon(96958, "manufacturer2", 5, CouplerType.MANUAL, 531.29, 'C', CargoType.CAGE);
        GoodsWagon goodsWagon4 = new GoodsWagon(96278, "manufacturer3", 5, CouplerType.SEMI_PERMANENT, 682.89, 'C', CargoType.CAGE);

        railroadCars.add(goodsWagon);
        railroadCars.add(goodsWagon2);
        railroadCars.add(goodsWagon3);
        railroadCars.add(goodsWagon4);

        Locomotive locomotive = new Locomotive(96333, "manufacturer1", 4, CouplerType.SEMI_PERMANENT, MotorType.ELECTRIC);
        locomotives.add(locomotive);

        Train train = new Train(9931, locomotives, railroadCars);

        trains.add(train);

        Enterprise enterprise = new Enterprise("100.100.100-3", "Super Train", trains);

        for(Train trainP : enterprise.listOfElectricTrains()) {
            System.out.println(trainP.toString());
        }
        // should see train id, which is 9931
    }
}
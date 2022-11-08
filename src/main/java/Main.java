import model.*;

import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GoodsWagon goodsWagon = new GoodsWagon(10542, "MEVA S.A", 6, CouplerType.AUTOMATIC, 457.39, 'C', CargoType.TANK);
        GoodsWagon goodsWagon2 = new GoodsWagon(10543, "MEVA S.A", 6, CouplerType.AUTOMATIC, 497.19, 'A', CargoType.CAGE);
        GoodsWagon goodsWagon3 = new GoodsWagon(10544, "MEVA S.A", 6, CouplerType.MANUAL, 531.29, 'N', CargoType.CAGE);
        GoodsWagon goodsWagon4 = new GoodsWagon(10545, "MEVA S.A", 6, CouplerType.SEMI_PERMANENT, 682.89, 'D', CargoType.CAGE);

        Locomotive locomotive = new Locomotive(10541, "Alstom Ferroviaria", 4, CouplerType.SEMI_PERMANENT, MotorType.ELECTRIC);
        PassengersCar passengersCar = new PassengersCar(10546, "General Motors", 8, CouplerType.MANUAL, 389.72, 'B', 6, 9);

        Train train = new Train(10541);
        Train train2 = new Train(10593);

        train.addLocomotive(locomotive);
        train.addRailroadCar(goodsWagon);
        train.addRailroadCar(goodsWagon2);
        train.addRailroadCar(goodsWagon3);
        train.addRailroadCar(goodsWagon4);

        train2.addLocomotive(locomotive);
        train2.addRailroadCar(goodsWagon);
        train2.addRailroadCar(goodsWagon2);
        train2.addRailroadCar(goodsWagon3);
        train2.addRailroadCar(goodsWagon4);

        train2.addRailroadCar(passengersCar);

        Enterprise enterprise = new Enterprise("100.100.100-3", "Super Train");
        enterprise.addTrain(train);
        enterprise.addTrain(train2);

        for (Train trainP : enterprise.listOfElectricTrains()) {
            System.out.println(trainP.toString());
        }

        System.out.println(enterprise.exitsTrain(10512));
    }
}
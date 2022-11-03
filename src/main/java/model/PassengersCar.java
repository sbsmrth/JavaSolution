package model;

public class PassengersCar extends RailroadCar{
    private int rows;
    private int seatsPerRow;
    public PassengersCar(int id, String manufacturer, int numWheels, CouplerType couplerType, double speed, char speedType, int rows, int seatsPerRow) {
        super(id, manufacturer, numWheels, couplerType, speed, speedType);
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public void setSeatsPerRow(int seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
    }

    public int getTotalChairs() {
        return rows * seatsPerRow;
    }
}

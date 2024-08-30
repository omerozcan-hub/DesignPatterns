public class Main {
    public static void main(String[] args) {

        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();

        carFactory.makeVehicle();
        truckFactory.makeVehicle();
    }
}
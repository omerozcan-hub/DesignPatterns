public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void makeVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.design();
        vehicle.manufacture();
    }
}

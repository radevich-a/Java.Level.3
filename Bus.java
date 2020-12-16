public class Bus extends Vehicle implements Runnable {
    public Bus(String name) {
        vehicle_name = name;
        capacity = 40F;
        size = 40F;
        consumption = 7.5F;
    }

    @Override
    public void run() {
        drive();
    }
}

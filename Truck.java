public class Truck extends Vehicle implements Runnable{
    public Truck(String name){
        vehicle_name = name;
        capacity = 60F;
        size = 60F;
        consumption = 15F;
    }

    @Override
    public void run() {
        drive();
    }
}

public class Car extends Vehicle implements Runnable{

    public Car(String name) {
        vehicle_name = name;
        capacity = 20F;
        size = 20F;
        consumption = 2.5F;

    }


    @Override
    public void run() {
        drive();
    }
}

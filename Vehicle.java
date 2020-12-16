abstract class Vehicle{

    protected String vehicle_name;
    protected float capacity;
    protected float size;
    protected float consumption;
    protected boolean running;
    protected FuelStation fuelStation;

    public Vehicle() {
        fuelStation = new FuelStation();
    }

    public void drive(){
        try {
            while (size > 3){
                System.out.println(String.format("[%s] is on the road... ", vehicle_name));
                Thread.sleep(3000);
                size -= consumption;
                System.out.println(String.format("[%s] remaining fuel...%s ", vehicle_name, size));
            }
            System.out.println(String.format("[%s] has not enough fuel...%s ", vehicle_name, size));
            float refuel = fuelStation.refuel(capacity - size);
            if (refuel == 0F){
                System.out.println(String.format("[%s] is stuck without fuel... ", vehicle_name));
                return;
            }
            size += refuel;
            drive();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getName(){
        return vehicle_name;
    }

    public float getCapacity(){
        return capacity;
    }

    public boolean isRunning(){
        return running;
    }


}

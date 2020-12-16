import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Car("Car"));
        executorService.submit(new Truck("Truck"));
        executorService.submit(new Bus("Bus"));
        executorService.shutdown();

    }
}

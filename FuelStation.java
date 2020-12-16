import java.util.concurrent.Semaphore;

public class FuelStation {
    private Semaphore semaphore;
    private GasPool gasPool;

    public FuelStation() {
        this.semaphore = new Semaphore(3);
        this.gasPool = new GasPool();
    }

    public float refuel(float amount){
        try {
            semaphore.acquire();
            Thread.sleep(1200);
            float request = gasPool.request(amount);
            if (request == 0F){
                System.out.println(gasPool);
                return 0F;
            }
            return request;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return 0;
    }
}

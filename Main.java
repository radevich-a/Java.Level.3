import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {
        PrintChar abc = new PrintChar();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(abc::printA);
        executorService.submit(abc::printB);
        executorService.submit(abc::printC);

        executorService.shutdown();





    }
}

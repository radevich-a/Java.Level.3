import java.io.*;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static void main(String[] args) {

            writeToFile();
    }

    public static void writeToFile(){
        Date date = new Date();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str  = reader.readLine();
            OutputStream file = new FileOutputStream(
                    "C:/Users/79639/IdeaProjects/InputOutputFile/src/logger.txt",
                    true
            );

            file.write((str + date + "\r\n").getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printLastNLinesSecond(int lines) {
        File file = new File("C:/Users/79639/IdeaProjects/InputOutputFile/src/test.txt");

        try {
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            long fileLength = file.length() - 1;
            StringBuilder sb = new StringBuilder();
            int reachedLines = 0;

            raf.seek(fileLength);

            for (long ptr = fileLength; ptr >= 0 ; ptr--) {
                raf.seek(ptr);
                char c = (char) raf.read();

                if (c == '\n') {
                    reachedLines++;

                    if (reachedLines == lines) {
                        break;
                    }
                }

                sb.append(c);
            }

            sb.reverse();

            System.out.println(sb.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

}

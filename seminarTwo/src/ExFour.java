import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ExFour {
    /*Ќапишите метод, который составит строку, состо€щую из 100 повторений слова TEST
    и метод, который запишет эту строку в простой текстовый файл, обработайте исключени€.*/

    static void solution(String s, String file, int num) {

        Logger logger = Logger.getAnonymousLogger();
        SimpleFormatter formatter = new SimpleFormatter();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
            fileHandler.setFormatter(formatter);
        } catch (IOException e){
            e.printStackTrace();
        };
        logger.addHandler(fileHandler);


        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(s).repeat(Math.max(0, num)));

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(sb.toString());
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
    }
}

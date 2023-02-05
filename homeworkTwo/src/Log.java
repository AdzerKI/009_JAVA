import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {

    // date time - code - result - event
    static void custom(int code, String module, String event) {
        /*
         * @code
         * 200 - ok
         * 400 - error
         */

        // ����
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);

        // �������� ������ ����
        StringBuilder sb = new StringBuilder();
        sb.append(strDate).append(" - ").append(code).append(" - ").append(module).append(" - ").append(event).append("\n");

        // ���������� � ��� ����
        try (FileWriter fw = new FileWriter(Config.LOGFILE, true)) {
            fw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void add(String type, String text) {
        Logger logger = Logger.getAnonymousLogger();

        SimpleFormatter formatter = new SimpleFormatter();

        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(Config.LOGFILE, true);
            fileHandler.setFormatter(formatter);
        } catch (IOException e){
            e.printStackTrace();
        };

        logger.addHandler(fileHandler);

        if (type.equals("w")){
            logger.log(Level.WARNING, text);
        } else {
            logger.log(Level.ALL, text);
        }
        
        fileHandler.close();
    }

}

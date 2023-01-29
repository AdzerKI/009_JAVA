import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** эту либу я у себя добавил в идею, давно с чистой явой дел не имел без мавена,
не уверен что будет работать */
import org.json.*;

public class Json {

    // Получаем данные из файла
    static String fileToString(String file) {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            Log.custom(200, "Json.parse", "String parsed");

            return sb.toString().replace("\r\n", "");
        } catch (IOException e) {
            Log.custom(400, "Json.parse", e.getMessage());
        }

        Log.custom(400, "Json.parse", "null returned");
        return null;
    }

    // Получаем готовые строки из данных json
    static String printJson(String json) {
        StringBuilder stringBuilder = new StringBuilder();
        JSONArray jsonArray = new JSONArray(json);

        // Перебираем массив json
        for (int i = 0; i < jsonArray.length(); i++) {
            String surname = jsonArray.getJSONObject(i).getString("фамилия");
            String result = jsonArray.getJSONObject(i).getString("оценка");
            String predmet = jsonArray.getJSONObject(i).getString("предмет");
            stringBuilder
                    .append("Студент ")
                    .append(surname)
                    .append(" получил ")
                    .append(result)
                    .append(" по предмету ")
                    .append(predmet)
                    .append(". ");
        }

        Log.custom(200, "Json.printJson", "Json printed");
        return stringBuilder.toString();
    }
}

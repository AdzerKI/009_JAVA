import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/*
 * Даны 2 файла, в каждом из которых записан многочлен, сформировать файл с суммой многочленов
 */

public class ExTwo {

    final static String DIR = "C:\\GitHub\\geekbrains\\009_JAVA\\lectionOne\\data\\";

    public static void exTwo() throws FileNotFoundException {

        // Считывааем файл 1
        String filePathOne = "data/first.txt";
        String contentOne = null;

        String filePathTwo = "data/second.txt";
        String contentTwo = null;

        // Считываем файл 1
        try {
            contentOne = readFile(filePathOne);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Считываем файл 2
        try {
            contentTwo = readFile(filePathTwo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Записываем в 3 файл
        try (PrintWriter out = new PrintWriter(DIR + "result.txt", StandardCharsets.UTF_8))
        {
            out.print(contentOne);
            out.print("\n");
            out.print(contentTwo);
            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
        return reader.lines().collect(Collectors.joining(System.lineSeparator()));
    }


}

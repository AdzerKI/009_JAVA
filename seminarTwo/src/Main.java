import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1
//        System.out.println(ExOne.solution(6, 'a', 'b'));

        // 2
//        System.out.println(ExTwo.solution("aaaabbbcddf"));

        // 3
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter String: ");
//        String s = br.readLine();
//        System.out.println(ExThree.solution(s));

        // 4
//        String s ="TEST";
//        String file = "file.txt";
//        int num = 100;
//        ExFour.solution(s, file, num);


        // 5
        // System.out.println(readFile("log.txt"));



    }

    static String readFile (String file){
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

}

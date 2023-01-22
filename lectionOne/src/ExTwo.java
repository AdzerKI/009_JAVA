import java.io.*;

/*
 * Даны 2 файла, в каждом из которых записан многочлен, сформировать файл с суммой многочленов
 */

public class ExTwo {
    public boolean exTwo() {
        // Первый многочлен
        try(FileReader reader = new FileReader("lectionOne\\first.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        // Второй многочлен
        try(FileReader reader = new FileReader("lectionOne\\second.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter("second.txt", false))
        {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

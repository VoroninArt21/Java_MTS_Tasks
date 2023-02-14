import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        //чтение строки из файла
        try
        {
            //переменная для хранения суммы всех цифр из строки
            int sum =0;

            Scanner scan = new Scanner(new File("Text_number.txt"));
            String text = scan.nextLine();
            scan.close();

            //используем regex \\d для выбора из строки только цифр
            Pattern pat = Pattern.compile("\\d");
            Matcher match = pat.matcher(text);

            //с помощью while и find "пробегаемся" по строке и находим элементы соответствующие поиску
            while(match.find())
            {
                sum += Integer.parseInt(match.group());
            }

            System.out.println("Сумма всех цифр в строке из файла: " + sum);
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

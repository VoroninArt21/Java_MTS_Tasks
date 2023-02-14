import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1_2 {
    public static void main(String[] args){

        //переменная для хранения суммы всех цифр из строки
        int sum = 0;

        //с помощью Scanner вводим любую строку
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scan.nextLine();
        scan.close();

        //используем regex \\d для выбора из строки только цифр
        Pattern pat = Pattern.compile("\\d");
        Matcher match = pat.matcher(text);

        //с помощью  while и find "пробегаемся" по строке и находим элементы соответствующие поиску
        while(match.find())
        {
            sum += Integer.parseInt(match.group());
        }

        System.out.println("Сумма всех цифр в строке: " + sum);
    }
}
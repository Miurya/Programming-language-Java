/*
    Лабораторная работа 1
    Задание 2
    Задачи 10: Вывод дней недели
*/
import java.util.Scanner;

public class Main {
    public static String readStr() // функция ввода строки с консоли
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = input.nextLine();

        return str;
    }

    public static void printDays (String x) // вывод дней недели
    {
        System.out.print("результат:\n");
        switch (x) {
            case "понедельник": { System.out.print("понедельник\n");}
            case "вторник": { System.out.print("вторник\n");}
            case "среда": { System.out.print("среда\n");}
            case "четверг": { System.out.print("четверг\n");}
            case "пятница": { System.out.print("пятница\n");}
            case "суббота": { System.out.print("суббота\n");}
            case "воскресение": { System.out.print("воскресение"); break;}
            default: { System.out.print("это не день недели"); }
        }

    }

    public static void main(String[] args) {

        String x = readStr().trim();
        printDays (x);
    }
}
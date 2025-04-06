/*
    Лабораторная работа 1
    Задание 2
    Задачи 4: Строка сравнения
*/
import java.util.Scanner;
public class Main {
    public static int readI() // функция ввода с консоли и проверка на корректность
    {
        Scanner input = new Scanner(System.in);
        boolean is = true;
        int res = 0;
        while (is)
        {
            try {
                System.out.print("Введите целое число: ");
                String str = input.nextLine();
                res = Integer.parseInt(str);
                is = false;
            }
            catch (Exception e)
            {
                System.out.print("Некорретный ввод данных. Попробуйте снова.\n");
            }
        }
        return res;
    }

    public static String makeDecision (int x, int y) // строка сравнений
    {
        String str = "";
        if (x == y) {
            str = x + " == " + y;
            return str;
        }
        if (x > y) {
            str = x + " > " + y;
        }
        else { str = x + " < " + y;}
        return str;
    }

    public static void main(String[] args) {

        int x = readI(), y = readI();
        String str = makeDecision(x, y);
        System.out.print("Результат: " + str);
    }
}
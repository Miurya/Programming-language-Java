/*
    Лабораторная работа 1
    Задание 1
    задача 1: Дробная часть
*/
import java.util.Scanner;

public class Main {

    public static double readD() // функция ввода с консоли и проверка на корректность (вещественные числа)
    {
        Scanner input = new Scanner(System.in);
        boolean is = true;
        double res = 0;
        while (is)
        {
            try
            {
                System.out.print("Введите вещественное число (с точкой): ");
                String str = input.nextLine();
                res = Double.parseDouble(str);
                is = false;
            }
            catch (Exception e)
            {
                System.out.print("Некорретный ввод данных. Попробуйте снова.\n");
            }
        }
        return res;
    }

    public static double fraction (double x) // функция получения дробной части числа
    {
        int k = (int) x;
        x = x - ((double) k);
        return x;
    }

    public static void main(String[] args) {
        double x = readD();
        x = fraction(x);
        System.out.printf("Результат: %f", x);

    }
}
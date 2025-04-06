/*
    Лабораторная работа 1
    Задание 2
    Задачи 1: Модуль числа
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

    public static int abs (int x) // модуль числа (задача 1)
    {
        if (x < 0) {
            x*=(-1);
        }
        return x;
    }

    public static void main(String[] args) {
        int x = readI();
        x = abs(x);
        System.out.print("Результат: " + x);

    }
}
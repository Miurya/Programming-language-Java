/*
    Лабораторная работа 1
    Задание 1
    Задачи 8: Делитель
*/

import java.util.Scanner;

public class Main {

    public static int readI() // функция ввода с консоли и проверка на корректность (целочисленные значения)
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

    public static boolean isDivisor (int a, int b) // проверка на деление нацело
    {
        if (a == 0 || b == 0 || a%b == 0 || b%a == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int x = readI(), y = readI();
        boolean b = isDivisor(x,y);
        System.out.print("Результат: " + b);

    }
}
/*
    Лабораторная работа 1
    Задание 1
    Задачи 9: Равенство
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

    public static boolean isEqual(int a, int b, int c) // проверка на равенство 3х чисел
    {
        if (a == b && a == c){ return true;}
        return false;
    }

    public static void main(String[] args) {
        int a = readI(), b = readI(), c = readI();
        boolean bo = isEqual(a,b, c);
        System.out.print("Результат: " + bo);

    }
}
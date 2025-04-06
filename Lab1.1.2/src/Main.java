/*
    Лабораторная работа 1
    Задание 1
    Задача 2: Сумма знаков
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
                if (res > 9 || res < -9) { is = false; }
                else { System.out.print("Некорретный ввод данных. Число не является двухзначным! Попробуйте снова.\n"); }
            }
            catch (Exception e)
            {
                System.out.print("Некорретный ввод данных. Попробуйте снова.\n");
            }
        }
        return res;
    }

    public static int sumLastNums (int x) // сумма последних 2х знаков числа
    {
        int ost = x%10;
        x = x/10;
        return ost + x%10;
    }

    public static void main(String[] args) {
        int x = readI();
        x = sumLastNums(x);
        System.out.print("Результат: " + x);

    }
}
/*
    Лабораторная работа 1
    Задание 1
    Задачи 5: Двузначное
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

    public static boolean is2Digits (int x) // проверка двухзначное ли число
    {
        if ((x <= -10 && x >= -99) || (x>= 10 && x <=99)) { return true;}
        return false;
    }

    public static void main(String[] args) {
        int x = readI();
        boolean b = is2Digits(x);
        System.out.print("Результат: " + b);
    }
}
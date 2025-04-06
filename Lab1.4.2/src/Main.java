/*
    Лабораторная работа 1
    Задание 4
    Задача 2: Поиск последнего значения
*/

import java.util.Scanner;

public class Main {
    public static int[] readM(int[] arr) // присваиваем массиву значения
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        return arr;
    }
    public static void outM (int[] arr) // Вывод массива
    {
        System.out.print("Массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("\n");
    }
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

    public static int findLast (int[] arr, int x) // поиск последнего вхождения числа
    {
        int k = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x) {
                k = i;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int l = 7;
        int[] arr = new int[l];
        arr = readM(arr);
        outM(arr);
        int x = readI();
        x = findLast(arr, x);
        System.out.print("Результат: " + x);
    }
}
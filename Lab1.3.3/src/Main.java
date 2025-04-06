/*
    Лабораторная работа 1
    Задание 3
    Задачи 3: Четные числа
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
                if (res < 0) {
                    System.out.print("Необходимо ввести значение больше 0! Попробуйте снова.\n");
                }
                else { is = false;}
            }
            catch (Exception e)
            {
                System.out.print("Некорретный ввод данных. Попробуйте снова.\n");
            }
        }
        return res;
    }

    public static String chet (int x) // создание строки из четных чисел
    {
        String res = "";
        for (int i = 0; i <= x; i+=2) {
            res = res + " " + i;
        }
        return res;
    }

    public static void main(String[] args) {
        int x = readI();
        String res = chet(x);
        System.out.print("Результат: " + res);
    }
}
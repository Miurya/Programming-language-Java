/*
    Лабораторная работа 1
    Задание 2
    Задачи 5: Тройной максимум
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

    public static int max3 (int x, int y, int z) // тройной максимум
    {
        if (x >= y && x >= z) { return x;}
        if (y >= x && y >= z) { return y;}
        return z;
    }

    public static void main(String[] args) {
        int x = readI(), y = readI(), z = readI(), max = max3(x, y, z);
        System.out.print("Результат: " + max);
    }
}
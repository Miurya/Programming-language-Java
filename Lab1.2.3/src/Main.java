/*
    Лабораторная работа 1
    Задание 2
    Задачи 3: Тридцать пять
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

    public static boolean is35 (int x) // проверка кратности 3 или 5, но не обоим
    {
        if ((x%3 == 0 && x%5 != 0) || (x%5 == 0 && x%3 != 0))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int x = readI();
        boolean del35 = is35(x);
        System.out.print("Результат: " + del35);
    }
}
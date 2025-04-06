/*
    Лабораторная работа 1
    Задание 3
    Задачи 4: Степень числа
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

    public static int pow (int x, int y) // степени числа (задача 4)
    {
        int k = 1;
        for (int i = 0; i < y; i++){
            k *= x;
        }
        return k;
    }

    public static void main(String[] args) {
        int x, y;
        System.out.print("Введите основание.\n ");
        x = readI();
        System.out.print("Введите степени.\n ");
        y = readI();
        x = pow(x, y);
        System.out.print("Результат: " + x);
    }
}
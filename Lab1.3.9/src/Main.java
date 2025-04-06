/*
    Лабораторная работа 1
    Задание 3
    Задачи 9: Правый треугольник
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

    public static void leftTriangle (int x) // правый треугольник из символа "*"
    {
        String str = "*";
        for (int i = 0, k = x-1; i < x; i++, k--){

            for (int j = 0; j < k; j++){ System.out.print(" ");}
            System.out.println(str);
            str +=  "*";
        }
    }

    public static void main(String[] args) {
        int n = readI();
        leftTriangle(n);
    }
}
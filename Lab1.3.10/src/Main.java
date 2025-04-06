/*
    Лабораторная работа 1
    Задание 3
    Задачи 10:
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
                if (res < 0 || res > 9) {
                    System.out.print("Необходимо ввести значение больше 0 и меньше 9! Попробуйте снова.\n");
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
    public static void guessGame() // игра "угадать загаданное число (задача 10)
    {
        int ran = (int)(Math.random()*10), i = 1, x;

        boolean is = true;
        while (is){
            x = readI();
            if (x == ran) {
                System.out.print("Вы угадали!\nЧисло попыток:" + i);
                is = false;
            }
            else {
                System.out.print("Вы не угадали! \n");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        guessGame();
    }
}
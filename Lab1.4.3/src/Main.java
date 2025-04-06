/*
    Лабораторная работа 1
    Задание 4
    Задача 3: Поиск максимального
*/

public class Main {

    public static int[] readM(int[] arr) // присваиваем массиву значения
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
            if ((int)(Math.random()*10)>=5) {
                arr[i] *= -1;
            }
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

    public static int maxAbs (int[] arr) // поиск максимального по модулю числа в массиве
    {
        int k = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (Math.abs(k) <  Math.abs(arr[i])) {
                k = arr[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int l = 7;
        int[] arr = new int[l];
        arr = readM(arr);
        outM(arr);
        int max = maxAbs(arr);
        System.out.print("Результат: " + max);
    }
}
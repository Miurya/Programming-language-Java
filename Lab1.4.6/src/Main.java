/*
    Лабораторная работа 1
    Задание 4
    Задача 6: Реверс
*/

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

    public static void reverse (int[] arr) { // реверс массива (обратный порядок)
        int k;
        for (int i = 0, j = arr.length - 1; i < (int)(arr.length/2); i++, j--){
            k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
        }
    }

    public static void main(String[] args) {
        int l = 7;
        int[] arr = new int[l]; // {1,2,3,4,5,6,7}; {7,6,5,4,3,2,1};
        arr = readM(arr);
        outM(arr);
        reverse(arr);
        System.out.print("Результат: ");
        outM(arr);
    }
}
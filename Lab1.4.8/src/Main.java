/*
    Лабораторная работа 1
    Задание 4
    Задача 8: Объединение
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("\n");
    }

    public static int[] concat (int[] arr1,int[] arr2){ // соединение 2х массивов
        int l = arr1.length + arr2.length;
        int[] arr = new int[l];
        for (int i = 0, j = arr1.length; i < arr1.length || i < arr2.length; i++, j++){
            if (i < arr1.length) { arr[i] = arr1[i];}
            if (i < arr2.length) { arr[j] = arr2[i];}
        }
        return arr;
    }


    public static void main(String[] args) {
        int l1 = 3, l2 = 4, l = l1 + l2;
        int[] arr1 = new int[l1], arr2 = new int[l2], arr = new int[l];
        //int[] arr1 = {1,2,3}, arr2 = {6,7,8,9}; l = arr1.length + arr2.length; int[] arr = new int[l];
        //int[] arr1 = {6,7,8,9}, arr2 = {1,2,3}; l = arr1.length + arr2.length; int[] arr = new int[l];
        arr1 = readM(arr1); arr2 = readM(arr2);
        System.out.print("Массив1:");
        outM(arr1);
        System.out.print("Массив2:");
        outM(arr2);
        arr = concat(arr1,arr2);
        System.out.print("Результат:");
        outM(arr);
    }
}
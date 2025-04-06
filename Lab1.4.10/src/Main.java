/*
    Лабораторная работа 1
    Задание 4
    Задача 10: Удалить негатив
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("\n");
    }

    public static int[] deleteNegative (int[] arr){
        int[] arrR = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++){
            if (arr[i] >= 0) {
                arrR[j] = arr[i];
                j++;
            }
        }
        return arrR;
    }

    public static void main(String[] args) {
        int l = 7;
        int[] arr = new int[l]; //{-1,-2,-3,-4,-5,-6,-7};
        arr = readM(arr);
        System.out.print("Массив:");
        outM(arr);
        arr = deleteNegative(arr);
        System.out.print("Результат:");
        outM(arr);
    }
}
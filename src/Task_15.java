/*Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки. */

import java.util.Scanner; // импорт сканера

public class Task_15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте количество ячеек в массиве:");
        int num = in.nextInt();

        int[] listSort = new int[num];

        // ввод данных в ячейки
        for (int a = 0; a < listSort.length; a++) {
            System.out.println("Введите значение для ячейки " + a + ":");
            listSort[a] = in.nextInt();
        }
        for (int i = listSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (listSort[j] > listSort[j + 1]) {
                    int tmp = listSort[j];
                    listSort[j] = listSort[j + 1];
                    listSort[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированные значения массива:");
        for (int i = 0; i < listSort.length; i++) {
            System.out.println(listSort[i]);
        }
    }
}
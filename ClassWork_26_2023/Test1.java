package java_35e_HW.ClassWork_26_2023;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] array1 = new int[100_000_000];
        Random rd = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1 [i] = rd.nextInt();
        }
        minMax(array1, 2);
    }

    public static void minMax (int[] array, int n) {
        for (int i = 0; i < n; i++) {
            (new Thread(() -> {
//                int[] array2 = System.arraycopy(array, i);
                System.out.println();
            })).start();
        }

    }

}

// TODO
// 1. Написать метод, который получает на вход целое число n
// и массив элементов
// 2. В методе нужно создать n потоков, каждый из которых
// возьмет nую часть массива и выведет их минимум и максимум в консоль/
// 3. Создать массив на 100_000_000 элементов,
// заполнить случайными значениями и передать его в метод
// 4. Сделать вызовы с одним и тем же массивам
// и аргументами n (1, 2, 5, 10, 50, 100)
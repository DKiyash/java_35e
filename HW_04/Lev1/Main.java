package java_35e_HW.HW_04.Lev1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array1 = {45, 5, 15, 1, 3, 88};
        System.out.println(
                Arrays.toString(array1)
        );
        System.out.println("Среднее арифметрическое: " + arithmeticMean(array1));
    }
    private static double arithmeticMean(double[] array){
        double answer = 0;
        for (double i:array) answer += i/array.length;
        return answer;
    }
}
//First level: Напишите программу, которая выводит среднеарифметическое значение всех элементов в массиве:
//1. Сначала необходимо найти сумму всех элементов в массиве
//2. И найти среднеарифметическое ( число, равное сумме всех чисел множества, делённой на их количество )

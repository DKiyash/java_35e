package java_35e_HW.HW_10.Task_01;

import java.util.Arrays;

public class MyStack {
    private Object[] array;
    private int size = 0;

    public MyStack() {
        this.array = new Object[size];
    }

    public void push(Object str) {
        //увеличение размера нового массива
        size++;
        //создание нового массива
        Object[] newArray = new Object[size];
        //копирование значений в новый массив
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        //добавление нового элемента
        newArray[size - 1] = str;
        //передача указателя на новый массив
        array = newArray;
    }
    public Object peek() {
        //возвращение последнего элемента массива
        return array[size - 1];
    }
    public Object pop() {
        //проверка, что массив не пустой
        if (array.length == 0) return null;
        //запоминаем последний элемент изначального массива
        Object tmp = array[size - 1];
        //уменьшение размера нового массива
        size--;
        //создание нового массива
        Object[] newArray = new Object[size];
        //копирование значений в новый массив (без последнего элемента)
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i];
        }
        //передача указателя на новый массив
        array = newArray;
        //возвращение последнего элемента изначального массива
        return tmp;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

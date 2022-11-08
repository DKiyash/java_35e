package java_35e_HW.HW_11.Task_01;

import java.util.*;

class Liters {
    Set<Character> characterSet;
    public Liters(String str){
        this.characterSet = new HashSet<>();
        char[] tmp = str.toCharArray();//Преобразуем строку во временный массив букв
        Arrays.sort(tmp);//Сортируем массив букв для того, чтобы потом его корректно сравнивать
        //Добавляем буквы в набор. Повторяющиеся буквы в Set не будут добавляться.
        for (char ch: tmp) {
            characterSet.add(ch);
        }
        System.out.println(characterSet);//Вывод полученных массивов (для проверки)
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Liters liters = (Liters) o;
        return Objects.equals(characterSet, liters.characterSet);
    }
}

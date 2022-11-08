package java_35e_HW.HW_11.Task_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
        //Список уникальных наборов букв на основе входного массива строк
        List<Liters> litersList = new ArrayList<>();
        for (String str : words) {
            litersList.add(new Liters(str));
        }
        System.out.println();

        //Перебор списка наборов и вывод слова из words[],
        // который соотвествует по индексу набору.
        // Если набор уже участвовал в сравнении,
        // записываем в него null, чтобы он не использовался повторно
        for (int i = 0; i < litersList.size(); i++) {
            if (litersList.get(i) != null){//Вывод если первый раз попался уникальный набор
                System.out.print(words[i] + ", ");
            }
            for (int j = 0; j < litersList.size(); j++) {
                //Сначала проверка, что в текущем наборе внешнего и внутреннего цикла не записан уже null,
                //то есть, что он еще не попадался при переборе. Также проверка, что это не текущий
                // сравниваемый набор
                if (litersList.get(i) != null && litersList.get(j) != null && i != j) {
                    //Если совпадают наборы
                    if (litersList.get(i).equals(litersList.get(j))) {
                        //Вывод слова из words[] с индексом как у текущего набора внутреннего цикла
                        System.out.print(words[j] + ", ");
                        //Запись null в текущий набор внутреннего цикла, чтобы его повторно не сравнивать
                        litersList.set(j, null);
                    }
                }
            }
            //Перевод строки, если очередной уникальный набор перебран
            if (litersList.get(i) != null){
                System.out.println();
            }
            //Запись null в текущий набор внешнего цикла, чтобы его повторно не сравнивать
            litersList.set(i, null);
        }
    }
}

//TODO
//  Сгруппируйте слова с одинаковым набором символов
//  Дан список слов со строчными буквами. Реализуйте функцию поиска
//  всех слов с одинаковым уникальным набором символов.
//  вход:
//  String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
//  выход:
//  student, students,
//  cat, act,
//  dog, god,
//  flow, wolf

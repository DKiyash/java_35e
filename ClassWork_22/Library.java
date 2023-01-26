package java_35e_HW.ClassWork_22;

import java.util.List;

public class Library<T> {
    private List<T> list;

    public List <T> get(){
        return list;
    }

    public void add(){

    }
}
//TODO:
// 1. Реализовать класс таким образом, чтобы он мог хранить в себе объекты всех 4 типов
//  Написать реализацию без дженериков и с дженериками
//  реализовать методы get и add
//  Все объекты должны храниться в списке/массиве
//
//TODO:
// 2. Написать дополнительную реализацию для ситуации, когда все 4 класса
//  будут наследниками интерфейса Media

interface Media {}

class Book {

}

class Manuscript {

}

class Newspaper {

}

class Magazine {

}

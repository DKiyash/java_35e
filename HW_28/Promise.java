package java_35e_HW.HW_28;


public class Promise {
    public static void main(String[] args) {

    }
}

//1. Доделать классное задание, если не успели
//2. Реализовать класс Promise, который будет работать аналогично Future (в JS,
// например, такой функционал принадлежит именно что Promise).
//- Класс должен быть типизированным
//- Должны присутствовать методы hasValue(): boolean и getValue(): T
//- Реализовать функциональный интерфейс Promisable. Интерфейс должнен иметь метод <T> getPromise(): T
//- Реализовать класс PromiseRunner с методом run(Promisable<T>): Promise<T>, который возвращает
// пустой Promise и выполняет код из Promisable в отдельном потоке, меняя значение в Promise на вычисленное
package java_35e_HW.HW_01;

import java_35e_HW.HW_01.Model.Employee;

public class EmployeeTest {
    //Second level: 1. Создайте класс с именем Employee, который включает
    // в себя три части информации в качестве переменных экземпляра
    //- имя (тип String), фамилия (тип String) и месячная зарплата (double).
    //У вашего класса должен быть конструктор, который инициализирует три переменные экземпляра.
    //Предоставьте set и метод get для каждой переменной экземпляра.
    //Если месячная зарплата не является положительной, установите ее
    // равной 0.0 (Используем условный оператор в конструкторе)

    //Напишите тестовое приложение с именем EmployeeTest, которое демонстрирует возможности сотрудника класса.
    //Создайте два объекта Employee и отобразите годовую зарплату каждого объекта.
    //Затем повысьте каждому сотруднику на 10% и снова покажите годовую зарплату каждого сотрудника.
    //Пример вывода:
    //Годовая зарплата Джона Смита: 60000,00
    //Годовая зарплата Джейн Доу: 96000.00
    //
    //Повышение на 10% для каждого сотрудника
    //Годовая зарплата Джона Смита: 66000.00
    //Годовая зарплата Джейн Доу: 105600,00
    public static void main(String[] args) {
        Employee employee1 = new Employee("Джон", "Смит", 5000.00);
        Employee employee2 = new Employee("Джейн", "Доу", 8000.00);

        System.out.printf("Годовая зарплата %s %s : %.2f",
                employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary()*12);
        System.out.println();
        System.out.printf("Годовая зарплата %s %s : %.2f",
                employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary()*12);
        System.out.println();

        employee1.setMonthlySalary(employee1.getMonthlySalary()*1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary()*1.1);
        System.out.println();

        System.out.printf("Годовая зарплата %s %s : %.2f",
                employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary()*12);
        System.out.println();
        System.out.printf("Годовая зарплата %s %s : %.2f",
                employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary()*12);
        System.out.println();
    }
}

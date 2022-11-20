package java_35e_HW.HW_14;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        //without lambda
        button.click(new ButtonAction() {
            @Override
            public void performAction() {
            }
        });
        System.out.println();

        //with lambda
        button.click(() -> {});
    }
}

//TODO
//  First level: Написать интерфейс Класс Button с методом void click(ButtonAction action)
//  Написать функциональный интерфейс ButtonAction с методом performAction
//  Создать Button и вызвать у него метод click 2 раза -- с лямбдой и с method refrence
//  (для этого нужно будет создать реализацию интерфейса ButtonAction)

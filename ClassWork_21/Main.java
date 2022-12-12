package java_35e_HW.ClassWork_21;

public class Main {
    public static void main(String[] args) {
        exTest();
    }

    public static void exTest(){
        try {
            int[] array = new int[5];
            array[6] = 5;
        }
        catch (ArrayIndexOutOfBoundsException exp){
            System.out.println("Выход за размер массива");
        }
        finally {
            System.out.println("Вывод в finally");
        }

    }
}
//Написать метод, который в блоке catch бросает ошибку
// и проверить, выполнится ли finally в таком случае


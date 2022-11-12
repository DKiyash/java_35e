package java_35e_HW.HW_11.Task_02;

import java.util.Map;
import java.util.Objects;

public class MyHashMap {
    private Node[] table;
    private int capasity = 16;
    private int currentFill = 0;
    private int size = 0;
    private float loadCapasity = 0.75f;

    public MyHashMap() {
        this.table = new Node[capasity];
    }

    //Добавление элемента в массив
    public void put(String key, String value) {
        if ((float) currentFill / (float) capasity >= loadCapasity) {
            System.out.println("НУЖНО РАСШИРЯТЬ");
            System.out.println();
            return;
        }
        Node newNode = new Node(capasity, key, value);
        System.out.println("Index: " + newNode.hash);
        //Добавление нового элемента в пустое место
        if (table[newNode.hash] == null) {
            table[newNode.hash] = newNode;
            size++;
            currentFill++;
        } else {
            Node tmp = table[newNode.hash];
            while (true) {
                //Ключ уже существует (ничего не делаем, выходим)
                if (tmp.key == key) {
                    System.out.println("Ключ уже существует");
                    break;
                } else if (tmp.next == null) {//Если это последний элемент в списке по данному индексу
                    //Добавление нового элемента в конец списка по тому же индексу (при коллизии) и выходим
                    tmp.next = newNode;
                    size++;
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    //Получение элемента
    public String get(String key){
        int index = Objects.hashCode(key) & (capasity - 1);
        System.out.println("index = " + index);
        Node tmp = table[index];
        while (true){
            if (tmp.key == key) return tmp.value;
            else if (tmp.key != key && tmp.next == null) {
                return "Элемент не найден";
            }
            tmp = tmp.next;
        }
    }

    @Override
    public String toString() {
        String str = "";
        int i = 0;
        for (Node node : table) {
            str += "Index: " + i + " ";
            if (node == null) {
                str += "null" + "\n";
            } else {
                str += node.toString() + "\n";
            }
            i++;
        }
        return str;
    }

    public int getSize() {
        return size;
    }

    static class Node {
        final int hash;
        final String key;
        String value;
        Node next;

        Node(int currentCapasity, String key, String value) {
            this.key = key;
            this.value = value;
            this.hash = hashCode() & (currentCapasity - 1);
            this.next = null;
        }

        public final String getKey() {
            return key;
        }

        public final String getValue() {
            return value;
        }

        public final String toString() {
            String str = key + " = " + value;
            Node tmp = next;
            while (tmp != null) {
                str += "; " + tmp.key + "=" + tmp.value;
                tmp = tmp.next;
            }
            return str;
        }

        public final int hashCode() {
            return Objects.hashCode(key);
//            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final String setValue(String newValue) {
            String oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;

            return o instanceof Map.Entry<?, ?> e
                    && Objects.equals(key, e.getKey())
                    && Objects.equals(value, e.getValue());
        }
    }

}

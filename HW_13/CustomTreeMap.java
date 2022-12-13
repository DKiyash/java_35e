package java_35e_HW.HW_13;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class CustomTreeMap <K, V> {
    //TODO
    //  Реализовать простое бинарное дерево на основе кода из гита.
    //  Данное дерево должно поддерживать методы для добавления и получения элементов,
    //  а так же итератор, который будет позволять обходить его.
    //  Дерево должно быть построено по образу TreeMap и содержать пары ключ-значение для каждого узла
    private int size = 0;
    private Node<K, V> root = null;

    @Override
    public String toString() {
        inOder(root);//Начало вывода с корневого узла
        return "";
    }

    //метод для обхода всего дерева
   public void inOder(Node<K, V> curr){
        if (curr != null) {
            inOder(curr.left);
            System.out.println("\n Key: " + curr.key + " Data: " + curr.value);
            inOder(curr.right);
        }
   }

    public void put(K key, V value) {
        if (root == null) {
            root = new Node<>(key, value);
            size++;
            return;
        }

        // TODO: вычислить, в какую сторону должен добавляться элемент (лево или право)
        // TODO: получить доступ к последнему элементу, который будет родительским по отношению к данному

        Node<K, V> current = root; //Начало поиска места для вставки с корневого узла
        while (current.left != null && current.right != null){//пока не дойдем до листа (у узла нет потомков)
            if ((int) key < (int)current.key) {
                current = current.left;//двигаемся влево
            } else {
                current = current.right;//двигаемся вправо
            }
        }
        if ((int) key < (int)current.key) {
            current.left = new Node<>(key, value);//вставляем новый элемент в левой части
        } else {
            current.right = new Node<>(key, value);//вставляем новый элемент в правой части
        }
        size++;
    }


    public V get(K key) {
        Node<K, V> current = root; //Начало поиска с корневого узла
        while (current.key != key){//пока не найдем совпадающий ключ
            if(current.left == null && current.right == null) return null;//если больше нет потомков (элемента нет)
            if ((int) key < (int)current.key) {
                current = current.left;//двигаемся влево
            } else {
                current = current.right;//двигаемся вправо
            }
        }
        return current.value;
    }

    public int size() {
        return this.size;
    }

    public Iterator<K, V> iterator() {
        return new Iterator<>(root);
    }

    private static class Node<K, V> {
        private final K key;
        private final V value;

        Node<K, V> parent;
        Node<K, V> left;
        Node<K, V> right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node(K key, V value, Node<K, V> parent) {
            this(key, value);
            this.parent = parent;
        }

        public Node(K key, V value, Node<K, V> parent, Node<K, V> left, Node<K, V> right) {
            this(key, value, parent);
            this.left = left;
            this.right = right;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public static class Iterator<K, V> {

        private Node<K, V> node;

        private final ArrayDeque<Node<K, V>> stack = new ArrayDeque<>();

        private final Map<Node<K, V>, Boolean> map = new HashMap<>();

        public Iterator(Node<K, V> root) {
            this.node = root;
        }

        public boolean hasNext() {
            return node == null;
        }

        public Node<K, V> next() {
            if (!map.containsKey(node)) {
                map.put(node, node.right == null);
            }

            if (node.left != null && stack.peek() != node) {
                stack.push(node);
                node = node.left;
                return node;
            }

            if ((node.right != null)) {
                if (stack.peek() != node && node.left == null) {
                    stack.push(node);
                }

                if (!map.get(node)) {
                    map.put(node, true);
                    node = node.right;
                    return node;
                }
            }

            while (map.get(stack.peek())) {
                stack.pop();
                node = stack.peek();
            }

            return node;
        }
    }


}

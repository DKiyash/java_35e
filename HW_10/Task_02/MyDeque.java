package java_35e_HW.HW_10.Task_02;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class MyDeque extends ArrayList implements Deque {
    private ArrayList<Object> arrayList;

    public MyDeque() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void addFirst(Object o) {
        arrayList.add(0,o);
    }

    @Override
    public void addLast(Object o) {
        arrayList.add(o);
    }

    @Override
    public boolean offerFirst(Object o) {
        arrayList.add(0, o);
        return false;
    }

    @Override
    public boolean offerLast(Object o) {
        arrayList.add(o);
        return false;
    }

    @Override
    public Object removeFirst() {
        if (arrayList.isEmpty()) return null;
        arrayList.remove(0);
        return null;
    }

    @Override
    public Object removeLast() {
        if (arrayList.isEmpty()) return null;
        return arrayList.remove(arrayList.size() - 1);
    }

    @Override
    public Object pollFirst() {
        if (arrayList.isEmpty()) return null;
        return arrayList.remove(0);
    }

    @Override
    public Object pollLast() {
        if (arrayList.isEmpty()) return null;
        return arrayList.remove(arrayList.size() - 1);
    }

    @Override
    public Object getFirst() {
        return arrayList.get(0);
    }

    @Override
    public Object getLast() {
        return arrayList.get(arrayList.size() - 1);
    }

    @Override
    public Object peekFirst() {
        return arrayList.get(0);
    }

    @Override
    public Object peekLast() {
        return arrayList.get(arrayList.size() - 1);
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        arrayList.add(o);
        return false;
    }

    @Override
    public Object remove() {
        if (arrayList.isEmpty()) return null;
        return arrayList.remove(0);
    }

    @Override
    public Object poll() {
        if (arrayList.isEmpty()) return null;
        return arrayList.remove(0);
    }

    @Override
    public Object element() {
        if (arrayList.isEmpty()) return null;
        return arrayList.get(0);
    }

    @Override
    public Object peek() {
        if (arrayList.isEmpty()) return null;
        return arrayList.get(0);
    }

    @Override
    public void push(Object o) {
        arrayList.add(0, o);
    }

    @Override
    public Object pop() {
        if (arrayList.isEmpty()) return null;
        return arrayList.remove(0);
    }

    @Override
    public Iterator descendingIterator() {
        return arrayList.iterator();
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}

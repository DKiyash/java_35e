package java_35e_HW.ClassWork_02.Task_02;

import java.util.Comparator;

public class CategoryNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

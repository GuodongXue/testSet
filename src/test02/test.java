package test02;

import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Student(18, "nana", 180.5));
        set.add(new Student(18, "nana", 180.5));
        set.add(new Student(18, "nana", 180.5));
        set.add(new Student(18, "nana", 180.5));
        System.out.println(set);

    }
}

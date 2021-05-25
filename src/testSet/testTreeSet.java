package testSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class testTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(12);
        set.add(14);
        set.add(16);
        set.add(16);
        set.add(18);
        System.out.println(set.size());
        System.out.println(set);
    }
}

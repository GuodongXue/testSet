package testSet;

import test02.Student;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {
    /*public static void main(String[] args) {
        Set  set = new HashSet();
        set.add(12);
        set.add(14);
        set.add(16);
        set.add(16);
        set.add(18);
        System.out.println(set.size());
        System.out.println(set);


     */

    public static void main(String[] args) {
        //compare bj = new compare();
        //Comparator bj = new compare(); //多态
        //Set set = new TreeSet(bj);//将外部比较器和TreeSet利用构造器进行关联
        Set set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student1 s1 = (Student1)o1;
                Student1 s2 = (Student1)o2;
                //return s1.getAge()- s2.getAge();
                return s1.getName().compareTo(s2.getName());
            }
        });//项目中只用一次， 就用匿名内部类就好


        set.add(new Student1(18, "lili", 170.6));
        set.add(new Student1(19, "lil", 170.1));
        set.add(new Student1(18, "lli", 170.6));
        set.add(new Student1(18, "lii", 170.6));
        set.add(new Student1(18, "lili", 170.6));
        System.out.println(set);

    }
}

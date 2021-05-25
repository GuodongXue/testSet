package testSet;

import java.util.Comparator;
import java.util.Objects;

public class Student1 {
    private int age;
    private String name;
    private double height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student1(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Student1() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}'+"\t";
    }
    /*
    @Override
    public int compareTo(Object o) {
        //按照年龄
        Student1 other = (Student1) o;
        //return -(this.getAge() - other.getAge());
        //return ((Double)(this.getHeight())).compareTo( (Double)(other.getHeight()));
        //return this.getName().compareTo(other.getName());
        //按照姓名和年龄
        if(this.getName().compareTo(other.getName())==0){
            return -(this.getAge() - other.getAge());
        }else{
            return this.getName().compareTo(other.getName());
        }



    }

     */

}
class compare implements Comparator{
    public int compare(Object o1, Object o2){
        Student1 s1 = (Student1)o1;
        Student1 s2 = (Student1)o2;
        //return s1.getAge()- s2.getAge();
        return s1.getName().compareTo(s2.getName());
    }
}

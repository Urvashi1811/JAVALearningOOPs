package OOPs.CollectionFramwork_DSA.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1,"urvashi", 30);
        Student1 s2 = new Student1(2, "Richa", 45);
        Student1 s3 = new Student1(3, "Tom", 12);

        List<Student1> SL = new ArrayList();
        SL.add(s1);
        SL.add(s2);
        SL.add(s3);

        Collections.sort(SL, new AgeComparator());
        System.out.println(SL);
    }

}
class AgeComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getAge()-o2.getAge();
    }
}
class Student1{
    private int roll_no;
    private String name;
    private int age;

    public Student1(int roll_no, String name, int age) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package OOPs.CollectionFramwork_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"urvashi", 30);
        Student s2 = new Student(2, "Richa", 45);
        Student s3 = new Student(3, "Tom", 12);

        List<Student> SL = new ArrayList();
        SL.add(s1);
        SL.add(s2);
        SL.add(s3);

        Collections.sort(SL);
        System.out.println(SL);
    }
}


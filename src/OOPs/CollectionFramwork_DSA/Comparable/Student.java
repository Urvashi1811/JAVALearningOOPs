package OOPs.CollectionFramwork_DSA.Comparable;

public class Student implements Comparable<Student>{
    private int roll_no;
    private String name;
    private int age;


    //constructor
    public Student(int rollno,String name, int age){
        this.roll_no= rollno;
        this.name= name;
        this.age= age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

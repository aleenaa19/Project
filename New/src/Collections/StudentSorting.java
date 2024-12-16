/* We have a list of students with properties id,name and mark .
Sort the student list in the descending order of their mark using  comparator interface
*/

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int id;
    String name;
    float marks;
    public Student(int id,String name,float marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public float getMark() {
        return marks;
    }
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', mark=" + marks + "}";
    }
}

public class StudentSorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 85.5f));
        students.add(new Student(2, "Bob", 92.3f));
        students.add(new Student(3, "Charlie", 78.0f));
        students.add(new Student(4, "David", 88.7f));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getMark(), s1.getMark()); // Reverse the order

            }
        });
        for (Student student : students) {
            System.out.println(student);
        }


    }
}

package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Egor Poltarakov", 4
                , 7.5);
        Student st2 = new Student("Evelina Krasilya", 42
                , 8.3);
        Student st3 = new Student("Mikhail Ivanov", 1
                , 9.1);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getstudents");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudent: ");
        System.out.println(students);
        return students;
    }
}

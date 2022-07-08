package aop.aspects;


import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class universityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentLoggingAdvice() {
//        System.out.println("beforeGetStudentLoggingAdvice: Логируем получение " +
//                "списка студентов перед методом getStudents");
//    }

//
//    @AfterReturning(pointcut = "execution(* getStudents())"
//            , returning = "students")
//    public void afterReturningGetStudentLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        // Так делать нельзя)
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentLoggingAdvice: Логируем получение" +
//                "списка студентов после работы метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingingGetStudentLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingingGetStudentLoggingAdvice: Логируем выброс " +
//                "исключения " + exception);
//    }
//
//    @After("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice(){
//        System.out.println("afterGetStudentsLoggingAdvice: Логируем нормальное окончание работы метода или выброс исключения" );
//    }


}

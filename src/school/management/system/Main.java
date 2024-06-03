package school.management.system;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Teachers
        Teacher Lizzy = new Teacher(1 ,"Lizzy", 500 );
        Teacher Mellissa = new Teacher(2, "Mellissa", 700);
        Teacher Bob = new Teacher(3, "Bob", 900);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Mellissa);
        teacherList.add(Bob);

        //Students
        Student Ichigo = new Student(1, "Ichigo", 10);
        Student Rukia = new Student(2, "Rukia", 8);
        Student Kagenou = new Student(3, "Kagenou", 6);
        List<Student> studentList = new ArrayList<>();
        studentList.add(Ichigo);
        studentList.add(Rukia);
        studentList.add(Kagenou);

//        School creation
        School school_of_the_Elites = new School(teacherList, studentList);

        Ichigo.payFees(5000);
        System.out.println("School of the Elites has earned : Ksh." + school_of_the_Elites.getTotalMoneyEarned());

        Rukia.payFees(8000);
        System.out.println("School of the Elites has earned : Ksh." + school_of_the_Elites.getTotalMoneyEarned());

        System.out.println("-------------------- School of the Elites Pay Salary --------------------");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("School of the Elites has spent salary to " + Lizzy.getName() + " and now has ksh." + school_of_the_Elites.getTotalMoneyEarned());

        System.out.println(Rukia);
        System.out.println(Lizzy);
    }
}

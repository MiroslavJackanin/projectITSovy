package sk.itsovy.jackanin.ITSovy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Erik", "Lorinc", new Date());
        Student student2 = new Student("Filip", "Andrasik", new Date());
        Student student3 = new Student("Miroslav", "Jackanin", new Date());
        Group group1 = new Group("1N", 5);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.printAll();
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);

        group1.printAll();

        group1.deleteStudent(student3);
        group1.printAll();
    }
}

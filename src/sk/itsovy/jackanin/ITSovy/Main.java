package sk.itsovy.jackanin.ITSovy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Erik", "Lorinc", new int[]{12, 5, 1999});
        Student student2 = new Student("Filip", "Andrasik", new int[]{30,8,1976});
        Student student3 = new Student("Ondrej", "Jackanin", new int[]{15,5,1986});
        Student student4 = new Student("Miroslav", "Jackanin", new int[]{2,11,1988});
        Student student5 = new Student("Martin", "Krivy", new int[]{2,7,1998});
        Student student6 = new Student("Juraj", "Onofrej", new int[]{22,12,1978});
        Student student7 = new Student("Pavol", "Stary", new int[]{10,31,1945});
        Student student8 = new Student("Jozef", "Jarec", new int[]{2,5,1956});
        Group group1 = new Group("1N", 8);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student7);
        group1.addStudent(student8);
        group1.printAll();

        group1.sort();
        group1.printAll();

        System.out.println("------------");
        System.out.println(group1.randomStudent());

        System.out.println("---------------");
        System.out.println(Arrays.toString(group1.getStudents(11)));
    }
}

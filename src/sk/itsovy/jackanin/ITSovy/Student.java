package sk.itsovy.jackanin.ITSovy;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private int[] birthDate;
    private String[] subjects = new String[0];

    //CONSTRUCTOR
    public Student(String firstName, String lastName, int[] birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    //GETTER
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int[] getBirthDate() {
        return birthDate;
    }
    public int getBirthDay() {
        return birthDate[0];
    }
    public int getBirthMonth() {
        return birthDate[1];
    }
    public int getBirthYear() {
        return birthDate[2];
    }
    public String[] getSubjects() {
        return subjects;
    }

    //METHOD
    @Override
    public String toString(){
        return firstName+" "+lastName;
    }

    public boolean getZodiacSign(){
        return true;
    }

    public void addSubject(String subject){
        String[] tempSubjects = new String[subjects.length+1];
        tempSubjects[subjects.length] = subject;
        subjects = tempSubjects;
    }

    public void  printSubjects(){
        for (int i=0; i<subjects.length; i++){
            System.out.print(subjects[i]);
        }
    }

    public void deleteSubject(){

    }
}

package sk.itsovy.jackanin.ITSovy;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private int[] birthDate;
    private String[] subjects;
    private int numberOfSubjects;

    //CONSTRUCTOR
    public Student(String firstName, String lastName, int[] birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        subjects = new String[10];
        this.numberOfSubjects = 0;
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

    public boolean addSubject(String subject){
        if (subject == null || subject.equals(""))
            return false;

        boolean contains = false;
        for (int i=0; i<numberOfSubjects; i++){
            if (subjects[i].compareToIgnoreCase(subject) == 0){
                contains = true;
                break;
            }
        }

        if (!contains && numberOfSubjects<10){
            subjects[numberOfSubjects]=subject.toUpperCase();
            numberOfSubjects++;
            return true;
        }else
            return false;
    }

    public void printSubjects(){
        System.out.println("Student "+firstName+" "+lastName+" attends: ");
        for (int i=0; i<numberOfSubjects; i++){
            System.out.println(" - "+subjects[i]);
        }
    }

    public boolean deleteSubject(String subject){
        if (subject == null || subject.equals(""))
            return false;

        boolean contains = false;
        int position=0;
        for (int i=0; i<numberOfSubjects; i++){
            if (subjects[i].compareToIgnoreCase(subject) == 0){
                position=i;
                contains = true;
                break;
            }
        }
        if (contains){
            for (int i=position; i<numberOfSubjects-1; i++){
                subjects[i]=subjects[i+1];
            }
            numberOfSubjects--;
            return true;
        }else
            return false;
    }
}

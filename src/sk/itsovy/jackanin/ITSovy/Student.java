package sk.itsovy.jackanin.ITSovy;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDate;

    //CONSTRUCTOR
    public Student(String firstName, String lastName, Date birthDate) {
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
    public Date getBirthDate() {
        return birthDate;
    }

    //METHOD
    @Override
    public String toString(){
        return firstName+" "+lastName;
    }
}

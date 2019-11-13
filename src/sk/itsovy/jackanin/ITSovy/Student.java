package sk.itsovy.jackanin.ITSovy;

public class Student {
    private String firstName;
    private String lastName;
    private int[] birthDate;

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
    public int getBirthMonth() {
        return birthDate[1];
    }

    //METHOD
    @Override
    public String toString(){
        return firstName+" "+lastName;
    }

    public boolean getZodiacSign(){
        return true;
    }


}

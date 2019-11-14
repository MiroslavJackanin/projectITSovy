package sk.itsovy.jackanin.ITSovy;

import java.util.Random;

public class Group {
    private String name;
    private int size;
    private int capacity;
    private Student[] arr;

    //CONSTRUCTOR
    public Group(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.size=0;
        this.arr=new Student[capacity];
    }

    //GETTER
    public Student getStudent(String firstName, String LastName){
        return null;
    }

    //METHOD
    public boolean addStudent(Student student){
        if (student==null || size==capacity)
            return false;

        for (int i=0; i<size; i++){
            if (arr[i]==student){
                return false;
            }
        }
        arr[size]=student;
        size++;

        return true;
    }

    public boolean deleteStudent(Student student){
        if (student==null || size==0){
            return false;
        }
        int temp=0;
        for (int i=0; i<size; i++){
            if (arr[i]==student)
                temp=i;
        }
        for (int i=temp; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        size--;
        return true;
    }

    public void printAll(){
        System.out.println("List of students ["+name+"] : ");
        for (int i=0; i<size; i++){
            System.out.println("    "+arr[i].toString());
        }
    }

    public boolean sort(){
        if (size<=1)
            return false;
        for (int i=0; i<size; i++){
            for (int j=0; j<size-1;j++){
                if (arr[j].getLastName().compareToIgnoreCase(arr[j + 1].getLastName()) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }else if (arr[j].getLastName().compareToIgnoreCase(arr[j + 1].getLastName()) == 0){
                    if (arr[j].getFirstName().compareToIgnoreCase(arr[j + 1].getFirstName()) > 0){
                        Student temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        return true;
    }

    public Student randomStudent(){
        Random rand=new Random();
        int temp=rand.nextInt(size);
        return arr[temp];
    }

    public Student[] getStudents(int month){
        if (size == 0 || month <= 0 || month >=13){
            System.out.println("Wrong input");
            System.exit(1);
        }
        int temp=0;
        for (int i=0; i<size; i++){
            if (month == arr[i].getBirthMonth()){
                temp++;
            }
        }
        Student[] students = new Student[temp];
        temp=0;
        for (int i=0; i<size; i++){
            if (month == arr[i].getBirthMonth()){
                students[temp]=arr[i];
                temp++;
            }
        }
        return students;
    }

    public Student[] getStudentBySubject(){
        return null;
    }
 }

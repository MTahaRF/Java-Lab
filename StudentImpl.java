/*
 * This file shows the implementation of OOPS in java
 */

public class StudentImpl {
    public static void main(String[] args){
        Student s = new Student("Taha","7080");
        s.display();
    }
}
class Student{
    String name,rollno;
    Student(String nam,String roll){
        name=nam;
        rollno=roll;
    }
    void display(){
        System.out.printf("\nWelcome %s\nYour Roll Number is : %s\n",name,rollno);
    }
}

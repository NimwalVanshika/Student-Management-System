package com.sms;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager(){
        students=new ArrayList<>();
    }
    public void addstudent(Student student){
        students.add(student);
        System.out.println("student added successfully");
    }
    public void display(){
        if(students.isEmpty()){
            System.out.println("no student found");
            return;
        }
        System.out.println("\n----- Student List -----");
        for(Student s:students){
            System.out.println(s);

        }
    }
    public void searchstudent(int id){
        boolean found=false;

        for(Student s:students){
            if(s.getid()==id){
                System.out.println("found successfully");
                System.out.print(s);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("cannot find");
        }
    }
    public void deletestudent(int id) {
        boolean removed = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getid() == id) {
                students.remove(i);
                removed = true;
                break;
            }

        }
        if (removed) {
            System.out.println("removed successfullt");
        } else {
            System.out.println("not found");
        }
    }
}

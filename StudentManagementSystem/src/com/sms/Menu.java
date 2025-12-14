package com.sms;
import java.util.Scanner;
public class Menu {
    private StudentManager manager=new StudentManager();
    private Scanner sc=new Scanner(System.in);


    public void start(){
        while(true){
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3.Search student");
            System.out.println("4.Delete student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice=sc.nextInt();

            switch(choice) {
                case 1:
                    addStudentMenu();
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    manager.searchstudent(searchId);
                    break;
                case 4:
                    System.out.print("enter Id to delete: ");
                    int deleteId=sc.nextInt();
                    manager.deletestudent(deleteId);
                case 5:
                    System.out.println("exiting");
                    return;
                default:
                    System.out.println("invalid choice");
                }
            }
        }
    private void addStudentMenu() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        Student student = new Student(marks, id, grade,name);
        manager.addstudent(student);
    }
}
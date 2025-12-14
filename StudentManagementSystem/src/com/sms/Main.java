package com.sms;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManager manager=new StudentManager();
        Student s1=new Student(100,2023464062,1,"Vanshika");
        Student s2=new Student(86,202348626,88,"Angel");
        System.out.println(s1);
        manager.addstudent(s1);
        manager.addstudent(s2);

        manager.display();

        Menu menu=new Menu();
        menu.start();
    }
}
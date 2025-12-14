package com.sms;

public class Student {
    private final int  marks;
    private final int id;
    private final String name;
    private final int grade;

    public Student(int marks,int id,int grade,String name){
        this.marks=marks;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    public int getmarsks(){
        return marks;
    }
    public int  getgrades(){
        return grade;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public String toString(){
        return "ID:"+id+
                ", name"+name+
                ", marks"+marks+
                ",grades"+grade;
    }
}

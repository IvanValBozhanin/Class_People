package com.company.entities;

public class Student extends Person{
    private Class aClass;

    public Student(String name, String address, String phoneNumber, String email, Class aClass) {
        super(name, address, phoneNumber, email);
        this.aClass = aClass;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "aClass=" + aClass +
                '}';
    }
}

package com.company.entities;

import java.util.Date;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String date, String title) {
        super(name, address, phoneNumber, email, office, salary, date);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                "title='" + title + '\'' +
                '}';
    }
}

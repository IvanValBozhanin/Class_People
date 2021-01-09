package com.company;

import com.company.entities.*;
import com.company.entities.Class;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        generateResults();

    }

    public static void generateResults(){
        Person p = new Person("Ivan", "Sofia", "088", "iv@an.com");
        Student st = new Student("Iv", "Plovdiv", "087", "iv@si.com", Class.FRESHMAN);
        Employee e = new Employee("A", "a", "232", "dfs", "df", 235.24, "23.11.1212");
        Faculty f = new Faculty("B", "b", "66", "h", "s", 1111, "06.02.2402", 21, "Boss");
        Staff sf = new Staff("C", "c", "11", "ppp", "uf", 221, "14.08.637", "San");
        System.out.println(p.toString());
        System.out.println(st.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(sf.toString());
    }

}

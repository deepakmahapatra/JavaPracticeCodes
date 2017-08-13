package com.deepak;

import lombok.Getter;
import lombok.Setter;


public class you {

    @Getter @Setter private String fname;

    @Getter @Setter private String lname;
    @Getter @Setter private int age;

    public you (String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "you{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}

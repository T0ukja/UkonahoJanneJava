package com.lopputyo.janne.student;

public class Student{
    private String firstname;
    private long id = 1;
    public static long laskuri = 0;
    private String lastname;
    public Student(String nimi, String snimi) {

        this.firstname = nimi;
        this.lastname = snimi;
        this.id = laskuri;
        laskuri++;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public long getId() {
        return this.id;
    }

    public String getlastname() {
        return this.lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public String getfirstname() {
        return this.firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;

    }

    public String toString() {
        return this.lastname + this.firstname;
    }


}

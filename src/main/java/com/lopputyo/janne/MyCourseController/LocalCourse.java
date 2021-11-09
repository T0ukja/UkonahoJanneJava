package com.lopputyo.janne.MyCourseController;

public class LocalCourse extends Course {
    long onlinecourseid= 0;
    public static long studentcount = 0;
    public LocalCourse(String kurssinimii, String opettajanimii, String Address, String toteutustapa) {
        super(kurssinimii, opettajanimii, Address, toteutustapa);
        studentcount=onlinecourseid;
        studentcount++;
    }
}

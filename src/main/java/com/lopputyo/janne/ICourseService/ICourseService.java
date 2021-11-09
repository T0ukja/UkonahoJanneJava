package com.lopputyo.janne.ICourseService;

import java.util.List;

import com.lopputyo.janne.MyCourseController.Course;
import com.lopputyo.janne.MyCourseController.Student;

public interface ICourseService {

//<Course> String getCourseById(long courseId);
List<Student>getStudents();
List<Course>getCourses();
List<Student> getStudentById(long studentid);
List<Course> getCourseById(long courseid);
List<Course> getCoursesOfStudent(long studentId);
boolean addStudentToCourse(int studentId, int CourseId);

/*
    void startMachine();
    String getMachineInfo();

Void Student getStudentById(long studentid);
*/
}

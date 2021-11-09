
package com.lopputyo.janne.ICourseFileService;

import java.io.FileNotFoundException;
import java.util.List;

import com.lopputyo.janne.Course.Course;
import com.lopputyo.janne.student.Student;

public interface ICourseFileService {
    
List <Student> readStudentsFromFile(String filepath) throws FileNotFoundException;
List <Course> readCoursesFromFile(String filepath) throws FileNotFoundException;
}

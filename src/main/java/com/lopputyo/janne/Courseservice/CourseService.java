package com.lopputyo.janne.Courseservice;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.lopputyo.janne.Course.Course;
import com.lopputyo.janne.CourseFileService.CourseFileService;
import com.lopputyo.janne.ICourseService.ICourseService;
import com.lopputyo.janne.student.Student;

import org.springframework.stereotype.Service;



@Service
public class CourseService implements ICourseService {

    public static List<Student> students = new ArrayList<>();
    public static List<Course> courses = new ArrayList<>();
    public List<Course> onlinecourse = new ArrayList<>();



    // List<Course> listakurssista = new ArrayList<>()0;
    public CourseService() throws FileNotFoundException {
       //CourseFileService koulupalvelut = new CourseFileService();
    CourseFileService kurssipalvelut = new CourseFileService();
    students = kurssipalvelut.readStudentsFromFile("students.txt");
courses = kurssipalvelut.readCoursesFromFile("courses.txt");
  //students.add(new Student("masa", "neksks"));
  //students.add(new Student("masaa", "neksksss"));
      //  courses.add(new Course("matikan_perusteet", "opettaja1", "www.is.fi"));
       // courses.add(new Course("biologian_perusteet", "opettaja2", "www.moodle.fi"));

//courses.add(new OnlineCourse("kurssinimii", "opettajanimii", "kurssinimi", "online"));

//kurssii.readStudentsFromFile("students.txt");
    //CourseFileService.readStudentsFromFile("students.txt");
 
    courses.get(1).studentlist.add(students.get(0));

        
          } 
     
    


    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

 

    public List<Student> getStudentById(long id) {
        List<Student> studentlistid = new ArrayList<>();
        for (Student student : students){
           if (student.getId()==id){
            studentlistid.add(student);
           }
        }
        return studentlistid;
    }

    @Override
    public List<Course> getCoursesOfStudent(long studentId) {
List<Course> studentcourses = new ArrayList<>();
for (Course course : courses){
if(course.studentlist.equals(studentId)){

    studentcourses.add(course);
}


}
        return studentcourses;
}
    


    
    public List<String> onlinecourses(String online) {
        List<String> onlinecourse = new ArrayList<>();
    
        for (Course course : courses){
            if (course.getimplementation().equals("online")){
                
             onlinecourse.add(course.getCoursename());
            }
        }
            return onlinecourse;
        }
    @Override
    public List<Course> getCourseById(long courseid) {
        List<Course> courseidd = new ArrayList<>();
        for (Course course : courses){
           if (course.getCourseId()==courseid){
            courseidd.add(course);
           }
       }
       return courseidd;
    }



    @Override
    public boolean addStudentToCourse(int studentId, int CourseId) {

if(courses.get(CourseId).getimplementation().equals("online")){
    courses.get(CourseId).studentlist.add(students.get(studentId));
    return true;
}
else{

    if((courses.get(CourseId).studentlist.size() >= 25)){
        return false;

        
    }

    else{

        courses.get(CourseId).studentlist.add(students.get(studentId));

        return true;
    }

   
}
        /*

        if(courses.get(CourseId).getLuokka().equals("online")){

            if(courses.get(CourseId).opiskelijalista.size() >= 25){

              
                return false;


        
            }

            courses.get(CourseId).opiskelijalista.add(students.get(studentId));
            return true;

    
        }*/


        //courses.get(CourseId).opiskelijalista.add(students.get(studentId));

    }



}

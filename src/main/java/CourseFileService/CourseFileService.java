package CourseFileService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.lopputyo.janne.MyCourseController.Course;
import com.lopputyo.janne.MyCourseController.LocalCourse;
import com.lopputyo.janne.MyCourseController.OnlineCourse;
import com.lopputyo.janne.MyCourseController.Student;
import org.springframework.stereotype.Controller;
import ICourseFileService.ICourseFileService;

@Controller
public class CourseFileService implements ICourseFileService {

public CourseFileService() throws FileNotFoundException{

}

public List<Student> readStudentsFromFile(String filepath) throws FileNotFoundException {
    List<Student> studentsfromfile = new ArrayList<>();
    Scanner Studentscanner = new Scanner(new File(filepath));
    try { 
    while(Studentscanner.hasNextLine()) {

            String etunimi = Studentscanner.next();
            String sukunimi = Studentscanner.next();
        
            studentsfromfile.add(new Student(etunimi, sukunimi));

        }
Studentscanner.close();
    }
catch(Exception e) {
    System.out.println("virhe");
  }  
    return studentsfromfile;

}

public List<Course> readCoursesFromFile(String filepath) throws FileNotFoundException {
    List<Course> coursesfromfile = new ArrayList<>();

File f = new File(filepath);
Scanner sc = new Scanner(f);

try {
while(sc.hasNextLine()){

    String line = sc.nextLine();
    String[] info = line.split("--");

    if(info[3].contains("online")){
        coursesfromfile.add(new OnlineCourse(info[0], info[1], info[2],info[3]));
    }
    else{
        
        if(LocalCourse.studentcount <= 25){

            coursesfromfile.add(new LocalCourse(info[0], info[1], info[2],info[3]));
        }
      else{

break;
      }
        
    }

}
  
sc.close();
}
catch(Exception e) {
    System.out.println("virhe opiskelijoiden lisäämisessä");
  }
    return coursesfromfile;




    //  Block of code to try
  }

  
}
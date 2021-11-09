
package ICourseFileService;

import java.io.FileNotFoundException;
import java.util.List;

import com.lopputyo.janne.MyCourseController.Course;
import com.lopputyo.janne.MyCourseController.Student;

public interface ICourseFileService {
    
List <Student> readStudentsFromFile(String filepath) throws FileNotFoundException;
List <Course> readCoursesFromFile(String filepath) throws FileNotFoundException;
}

package com.lopputyo.janne.Course;

import java.util.ArrayList;
import java.util.List;

import com.lopputyo.janne.student.Student;

public class Course{
private String Coursename;
private String Teachername;
private long courseId = 0;
public static long studentcount = 0;
private String address;
private String implementation;
  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  public List<Student> studentlist = new ArrayList<>();


public Course(String coursename, String teachername, String Address, String Implementation){
    this.Coursename = coursename;
    this.Teachername = teachername;
    this.implementation = Implementation;
    this.courseId= studentcount;
    this.address = Address;

    studentcount++;
}



public Course(String coursename, String teachername, String Implementation){
  this.Coursename = coursename;
  this.Teachername = teachername;
  this.implementation = Implementation;
  this.courseId= studentcount;

  studentcount++;
}





  public String getimplementation() {
    return this.implementation;
  }

  public void setimplementation(String implementation) {
    this.implementation = implementation;
  }

public Course haeidop(){
  return null;


}
    public String getCoursename() {
        return this.Coursename;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    public String getTeachername() {
        return this.Teachername;
    }

    public void setTeachername(String Teachername) {
        this.Teachername = Teachername;
    }


  public long getCourseId() {
    return this.courseId;
  }

  public String toString() {
return Coursename;

}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragonba3.classmodeling;

/**
 *
 * @author xolot
 */
public class School2 {
 private int enrollment;
 private int numberOfTeachers;
 private String[] courseOffered;
 private String sportNickName;
 private String[] clubsOfferd;
 private Student[] studentRoster;
 
 public void enrollStudent(Student student){
     
 }

 public void unreollStudent(Student student){
     
 }

         public int getEnrollment() {
        return enrollment;
    }

      public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public String[] getCourseOffered() {
        return courseOffered;
    }

    public void setCourseOffered(String[] courseOffered) {
        this.courseOffered = courseOffered;
    }

    public String getSportNickName() {
        return sportNickName;
    }

    public void setSportNickName(String sportNickName) {
        this.sportNickName = sportNickName;
    }

    public String[] getClubsOfferd() {
        return clubsOfferd;
    }

    public void setClubsOfferd(String[] clubsOfferd) {
        this.clubsOfferd = clubsOfferd;
    }

    public Student[] getStudentRoster() {
        return studentRoster;
    }

    public void setStudentRoster(Student[] studentRoster) {
        this.studentRoster = studentRoster;
    }
 
 
    
}

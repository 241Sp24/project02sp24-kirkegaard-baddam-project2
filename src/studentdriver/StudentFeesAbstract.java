/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S539672
 */
public abstract class StudentFeesAbstract {
    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    private int CREDITS_PER_COURSE = 3;
    private double PER_CREDIT_FEE = 543.50;
    
    public StudentFeesAbstract(String studentName, int studentID,  boolean isEnrolled){
        this.studentName = studentName;
        this.studentID = studentID;
        this.isEnrolled = isEnrolled;
        
    }
    public String getstudentName(){
        return studentName;
    }
    public int getstudentID(){
        return studentID;
    }
    public boolean isIsEnrolled(){
        return isEnrolled;
    }
    public int getCREDITS_PER_COURSE(){
        return CREDITS_PER_COURSE;
    }
    public double getPER_CREDIT_FEE(){
        return PER_CREDIT_FEE;
    }
    public void setStudentName(String studentName){
       this.studentName = studentName; 
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public void setIsEnrolled(boolean isEnrolled){
        this.isEnrolled = isEnrolled;
    }
    public abstract double getPayableAmount();
    
    @Override
    public String toString(){
        return "Student Name: " + this.studentName + "\nStudent ID: " + this.studentID + "\nEnrolled: " + this.isEnrolled ;     
    }
}
    

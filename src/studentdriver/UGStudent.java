/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S539672
 */
public class UGStudent extends StudentFeesAbstract {
    private double scholarShip;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITINAL_FEE = 820.70;

    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.scholarShip = scholarShip;
        this.coursesEnrolled = coursesEnrolled;
        this.hasScholarship = hasScholarship;
    
    }
    public boolean isHasScholarship(){
        return hasScholarship;
    }
    public double getScholarshipAmount(){
        return scholarShip;
    }
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    public double getPayableAmount(){
        return ADDITINAL_FEE+ coursesEnrolled*3;
    }
    @Override
    public String toString(){
        return "Courses Register: " + coursesEnrolled+ "\nScholarship: " + hasScholarship + "\nScholarShip Amount: " + scholarShip + "\nPayable amount: " + getPayableAmount();
    }
}



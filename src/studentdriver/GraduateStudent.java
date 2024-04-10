/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S539672
 */
public class GraduateStudent extends StudentFeesAbstract {
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
        
    }
    public boolean isIsGraduateAssistant(){
        return isGraduateAssistant;
    }
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    public double getPayableAmount(){
        return ((coursesEnrolled * getCREDITS_PER_COURSE()) * getPER_CREDIT_FEE());
    }
    @Override
    public String toString(){
        return "Enrolled: " + coursesEnrolled + "\nGraduate Assistant: " + isGraduateAssistant + "Graduate Assistant Type: "+ graduateAssistantType + "Courses Enrolled" + coursesEnrolled + "Payable Amount: " + getPayableAmount();
    }
    
    
}

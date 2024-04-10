/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author S539672
 */
public class OnlineStudent extends StudentFeesAbstract {
    private int noofMonths;
    private double MONTHLY_FEE = 1245.25;
    
    public OnlineStudent(String studentName, String studentID, boolean isEnrolled, int noofMonths){
        super(studentName, studentID, isEnrolled);
        this.noofMonths = noofMonths;
    }
    public double getPayableAmount(){
        return PayableAmount;
    }
    public String toString(){
        System.out.println("Student Name: "+studentName+"Student ID: "+studentID+"Enrolled: "+isEnrolled+"Number Of Months: "+noofMonths+"Payable Amount: " );
    
        
    }
            
}
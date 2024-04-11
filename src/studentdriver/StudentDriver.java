
package studentdriver;
import java.util.*;
import java.io.*;

public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner input = new Scanner(System.in);
            System.out.println("Enter no of UG Students: ");
            int UGStudent = input.nextInt();
            System.out.println("Enter the no of Graduate students: ");
            int GraduateStudent = input.nextInt();
            System.out.println("Enter the no of online students: ");
            int OnlineStudent = input.nextInt();
            
        StudentFeesAbstract[] students = new File (input.csv);
        Scanner input = new Scanner (inputFile);
        int x = 0;
        
        while(input.hasNextLine()){
            String[] mystring = input.nextLine().split(",");
            if (x < 5){
                int studentID= Integer.parseInt(mystring[0]);
                String studentName = mystring[1];
                boolean isEnrolled = Boolean.parseBoolean(mystring[2]);
                int coursesEnrolled = Integer.parseInt(mystring[3]);
                boolean hasScholarship = Boolean.parseBoolean(mystring[4]);
                double getPayableAmount = Double.parseDouble(mystring[5]);
                
                students [x] = new UGStudent(studentName, studentID,isEnrolled,hasScholarship, getPayableAmount, coursesEnrolled);
                x++;
            }
            else if (x < 9){
                if(Boolean.parseBoolean(mystring[4])== true){
                    int studentID= Integer.parseInt(mystring[0]);
                    String studentName= mystring[1];
                    boolean isEnrolled = Boolean.parseBoolean(mystring[2]);
                    boolean isGraduateAssistant = Boolean.parseBoolean(mystring[4]);
                    String graduateAssistantType = mystring[5];
                    int coursesEnrolled = Integer.parseInt(mystring[3]);
                    
                    students [x] =new GraduateStudent(studentName, studentID,isEnrolled,isGraduateAssistant,graduateAssistantType,coursesEnrolled);
                    x++;
                }
                else if (Boolean.parseBoolean(mystring[4])==false){
                    int studentID =Integer.parseInt(mystring[0]);
                    String studentName = mystring[1];
                    boolean isEnrolled= Boolean.parseBoolean(mystring[2]);
                    boolean isGraduateAssistant= Boolean.parseBoolean(mystring[4]);
                    int coursesEnrolled = Integer.parseInt(mystring[3]);
                    
                    students [x] =new GraduateStudent(studentName, studentID,isEnrolled,isGraduateAssistant,coursesEnrolled);
                    x++;
                }
                else{
                    int studentID = Integer.parseInt(mystring[0]);
                    String studentName = mystring[1];
                    boolean isEnrolled = Boolean.parseBoolean(mystring[2]);
                    int noofMonths = Integer.parseInt(mystring[3]);
                    
                    students [x]=new OnlineStudent (studentName,studentID,isEnrolled,noofMonths);
                    x++;
                }
                System.out.println("***************Undergraduate Student List*******************");
                for(StudentFeesAbstract a: students){
                    if(a instanceof UGStudent){
                        System.out.println(a);
                        System.out.println("");
                    }
                }
                System.out.println("*************Graduate Student List****************");
                for( StudentFeesAbstract a: students){
                    if(a instanceof GraduateStudent){
                        System.out.println(a);
                        System.out.println("");
                    }
                }
                System.out.println("**************Online Student list***************");
                for( StudentFeesAbstract a: students){
                    if(a instanceof OnlineStudent){
                        System.out.println(a);
                        System.out.println("");
                    }
                }
            }
        }
        
    }

}

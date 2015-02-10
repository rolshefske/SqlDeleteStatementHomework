package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse {
private String courseName;
private String courseNumber;
private String coursePrerequisites;
private Double courseCredits;    
    
    
    
public void setCourseFields(String courseName, String courseNumber, String coursePrerequisites, Double courseCredits)
{
this.setCourseName(courseName);
this.setCourseNumber(courseNumber);
this.setCoursePrerequisites(coursePrerequisites);
this.setCourseCredits(courseCredits);     
}


public void getCourseFields()
{
System.out.println("Course Name: " + this.getCourseName());
System.out.println("Course Number: " + this.getCourseNumber());
System.out.println("Course Prerequisites: " + this.getCoursePrequisites());
System.out.println("Course Course: " + this.getCourseCredits());  
System.out.println();
}






private void setCourseName(String courseName)
{
            if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
    
    this.courseName = courseName;
    
}

private void setCourseNumber(String courseNumber)
{
   if(courseNumber == null || courseNumber.length() == 0) {
      JOptionPane.showMessageDialog(null,
      "Error: courseNumber cannot be null of empty string");
       System.exit(0);
        }
    this.courseNumber = courseNumber;
}

private void setCoursePrerequisites(String coursePrerequisites)
{
    this.coursePrerequisites = coursePrerequisites;
}

private void setCourseCredits(Double courseCredits)
{
    if(courseCredits < 0.5 || courseCredits > 4.0) {
    JOptionPane.showMessageDialog(null,
    "Error: credits must be in the range 0.5 to 4.0");
    System.exit(0);
    }
    this.courseCredits = courseCredits;
}



private String getCourseName()
{
    return this.courseName;
}

private String getCourseNumber()
{
    return this.courseNumber;
}

private String getCoursePrequisites()
{
    return this.coursePrerequisites;
}

private Double getCourseCredits()
{
    return this.courseCredits;

}
}

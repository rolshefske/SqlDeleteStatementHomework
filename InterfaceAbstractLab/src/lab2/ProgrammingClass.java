/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Lucifer
 */
public interface ProgrammingClass {
    
public void setCourseFields(String courseName, String courseNumber, String coursePrerequisites, Double courseCredits);    
public void getCourseFields();

public void setCourseName(String courseName);
public void setCourseNumber(String courseNumber);
public void setCoursePrerequisites(String coursePrerequisites);
public void setCourseCredits(Double courseCredits);
  
        
public String getCourseName();  
public String getCourseNumber();
public String getCoursePrequisites();
public Double getCourseCredits();        
}

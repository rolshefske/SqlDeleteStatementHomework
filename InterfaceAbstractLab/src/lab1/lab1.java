/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Lucifer
 */
public class lab1 {
    
       public static void main(String[] args) {

        ProgrammingCourse IntroToJava1 = new IntroJavaCourse();
        IntroToJava1.setCourseFields("Introduction To Java", "57357", "Intro to Programming", 4.0);
        IntroToJava1.getCourseFields();
        
        ProgrammingCourse IntroToProgrammingCourse1 = new IntroToProgrammingCourse();
        IntroToProgrammingCourse1.setCourseFields("Introduction to Programming", "534634534", "none", 3.0);
        IntroToProgrammingCourse1.getCourseFields(); 
        
        ProgrammingCourse AdvancedJava1 = new AdvancedJavaCourse();
        IntroToProgrammingCourse1.setCourseFields("Advanced Java", "5987534", "Introduction to Java", 3.0);
        IntroToProgrammingCourse1.getCourseFields();         
        
    } 
}

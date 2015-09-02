/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalTime;

/**
 *
 * @author Lucifer
 */
public class WelcomeService {
    
    private int currentTimeInHours = LocalTime.now().getHour();
    
    public String getName()
    {
        String name = "Richard";
        return name;
    }
    
    public String getGeneralTimeOfDay()
    {
        String generalTimefDay = null;
        
        if(currentTimeInHours >= 17 && currentTimeInHours <= 24)
        {
            generalTimefDay = "Evening";
        }
        else if(currentTimeInHours >=11 && currentTimeInHours <= 16)
        {
            generalTimefDay = "Afternoon";
        }
        else if(currentTimeInHours >=0 && currentTimeInHours <= 10)
        {
            generalTimefDay = "Morning";
        }
        return generalTimefDay;
    }
    
    public static void main(String[] args) {
        WelcomeService test = new WelcomeService();
        System.out.println(test.getGeneralTimeOfDay());
        System.out.println(test.getName());
    }
    
}

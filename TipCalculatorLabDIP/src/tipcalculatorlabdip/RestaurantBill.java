
package tipcalculatorlabdip;

import javax.swing.JOptionPane;

public class RestaurantBill implements TipData{
    
    private double tip;
    
    
    private double billAmount = Double.parseDouble(JOptionPane.showInputDialog("What is the restaurant bill amount"));
    private int serviceRating = Integer.parseInt(JOptionPane.showInputDialog("How was the service?\n 1 =  Excellent\n 2 = good\n 3= average \n 4 = shitty"));
    
    public double  calculateTipOutput()
    {
        if(this.serviceRating == 1){this.tip = (.20 * this.billAmount);}
        else if(this.serviceRating == 2){this.tip = (.15 * this.billAmount);}
        else if(this.serviceRating == 3){this.tip = (.07 * this.billAmount);}
        else if(this.serviceRating == 4){this.tip = (.01 * this.billAmount);}
        
        return this.tip;
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculatorlabdip;

/**
 *
 * @author rolshefske
 */
public class TipCalculatorLabDIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RestaurantBill test1 = new RestaurantBill();
        TipCalculator test2 = new TipCalculator(test1);
        
        BellHopService test3 = new BellHopService();
        TipCalculator test4 = new TipCalculator(test3);
    }
    
}

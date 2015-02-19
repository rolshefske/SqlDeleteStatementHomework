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
public class BellHopService implements TipData{
    private double tip = 3;
    
    public double calculateTipOutput()
    {
        return this.tip;
    }
}

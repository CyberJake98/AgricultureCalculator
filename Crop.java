/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agriprofitcalculator;

/**
 *
 * @author jacob
 */
public class Crop {
    private String cropName;
    private double cropPrice;
    
    //getters
    public String getCropName()
    {
        return this.cropName;
    }
    
    public double getCropPice()
    {
        return this.cropPrice;
    }
    
    //setters
    public void setCropName(String value)
    {
        
        this.cropName = value;
    }
    
   public void setCropPrice(double value)
   {
       this.cropPrice = value;
   }
    
   //no args constructor
   public Crop(){}
   
   public Crop (String cn, double cp)
   {
       this.cropName = cn;
       this.cropPrice = cp;
   }
   
   //overidden to String
   public String toString()
   {
       return this.cropName;
   }
   
}

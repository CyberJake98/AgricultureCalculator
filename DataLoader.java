/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agriprofitcalculator;

/**
 *
 * @author jacob
 */
public class DataLoader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    //give loadData method gives us an array of Crop objects which contains all of our data
    public Crop[] loadData()
    {
     //load up the crop names
        String cropNames[] = new String[6];
        cropNames[0] = "Select Crop";
        cropNames[1] = "Tomato";
        cropNames[2] = "Cucumber";
        cropNames[3] = "Pumpkin";
        cropNames[4] = "Eggplant";
        cropNames[5] = "Dragon Fruit";
        
        double cropPrices[] = new double [6];
        cropPrices[0] = 0;
        cropPrices[1] = 15.95;
        cropPrices[2] = 7.87;
        cropPrices[3] = 5.75;
        cropPrices[4] = 6.50;
        cropPrices[5] = 45.25;
        
        Crop cropList[] = new Crop[6];
        //use a loop to create all the crop objects and add them to the array 
        for(int i =0; i<cropNames.length; i++)
        {
            //make the crop object
            Crop c1 = new Crop(cropNames[i], cropPrices[i]);
            //add it to the array
            cropList[i] = c1;
        }
        return cropList;
    }
            

}

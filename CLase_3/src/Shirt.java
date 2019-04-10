/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Shirt {
    public int shirtID=0;//default ID for the shirt
    public String description = "-description required-";//default
    //The color codes are R=red, B=blue,G=green;U=unset
    public char colorCode='U';
    public double price = 0.0;//Default price for all shirts
    public int quantityInStock=0;
   
    //this method displays the value for an item
    public void displayInformation(){
        System.out.println("Shirt ID:"+shirtID);
        System.out.println("shirt description:"+description);
        System.out.println("color code:"+colorCode);
        System.out.println("shirt price:"+price);
        System.out.println("quantity in stock"+quantityInStock);
             
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class shirtTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shirt shirt1=new Shirt();
        shirt1.displayInformation();
        shirt1.shirtID=25;
        
        shirt1.displayInformation();
        shirt1.colorCode='b';
        
           shirt1.displayInformation();
           shirt1.description="camisa larga";
           
              shirt1.displayInformation();
              shirt1.price=41.5;
              
              shirt1.displayInformation();
              shirt1.quantityInStock=0;
              
              
              
              
        
    }
    
}

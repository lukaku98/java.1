/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


public class JavaApplication1 {

    
    public static void main(String[] args) {
        int x=20; //en switch solo se trabaja con byte,short,int,char,string
        
        switch(x){
            case 4:System.out.println("4");
            default:System.out.println("default");
            case 8: System.out.println("8");
            
            case 10: System.out.println("10");
        }
    }
    
}

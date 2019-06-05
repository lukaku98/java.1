/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id=0;
        double sueldos=0;
        int contid=0;
        double acumsueldos=0;
        boolean continuar=true;
        Scanner lector= new Scanner(System.in);
        while(continuar){
            System.out.println("ingrese empleado");
        id =lector.nextInt();
        if(id==999){
            continuar=false;
        }
        else
        {
            System.out.println("ingrese sueldo");
            sueldos =lector.nextDouble();
            acumsueldos=acumsueldos+sueldos;
            contid++;
                        
        }
        System.out.println("======================================");      
    
    
    }
        
System.out.println("la cantidad de empleados es" +contid);
        System.out.println("el total de los sueldos es" +acumsueldos);
}
}
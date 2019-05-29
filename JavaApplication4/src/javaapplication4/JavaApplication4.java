/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;//un centinela es una variable logica 
                           //cuyo valor cambiara segun se cumpla 
                           //una condicion dentro del bucle

import java.util.Scanner;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int valor;
        int acumulador=0;
        boolean continuar=true;
        while(continuar){
            System.out.println("ingrese un numero o 0 para terminar");
            valor=lector.nextInt();
            if(valor==0){
                continuar=false;
            }
            else{
                acumulador=acumulador + valor;
            }
            System.out.println("la suma es: "+acumulador);
                    
        }
    }
    
}

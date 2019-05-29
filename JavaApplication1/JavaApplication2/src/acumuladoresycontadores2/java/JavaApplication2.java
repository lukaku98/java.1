/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acumuladoresycontadores2.java;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner lector=new Scanner(System.in);
int edad;
int menorEdad=0;
int mayorEdad=0;
int acumulador=0;
int promedio=0;

for(int i=0; i<5;i++){
    System.out.println("ingrese edad");
    edad=lector.nextInt();
    if(edad<21){
       menorEdad++;
        
    }
    else
    {
        acumulador=acumulador+edad;
        mayorEdad++;
        promedio=acumulador/mayorEdad;
    }
}
        System.out.println(" la cantidad de personas menores:"+menorEdad);
        System.out.println("el promedio de mayores a 21 es: "+promedio);
    }
    
    
    
}

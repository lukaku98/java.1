/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
double acumulador=0;
double sueldo;
Scanner lector=new Scanner(System.in);

for(int i=1;i<=12;i++)
{
System.out.println("sueldo");

sueldo=lector.nextInt();

acumulador=acumulador+sueldo;


}

System.out.println ("la suma:"+ acumulador);
        
    
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abecedario;

/**
 *
 * @author alumno
 */
public class Abecedario {

   private char letra;
   
   public void ingresaletra(char valor){
       this.letra =valor;
       switch(valor){
           case'a': case'A': case'e':case'E':case'i':case'I':
               case'o':case'O':case'u':case'U':
                   System.out.println("es vocal"+valor);
                   break;
               default:
                   System.out.println("no es una vocal");
       
   }
   }
    public static void main(String[] args) {
        abecedario
        
    }
    
}

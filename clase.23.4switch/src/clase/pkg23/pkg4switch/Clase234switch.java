/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg23.pkg4switch;

/**
 *
 * @author alumno
 */
public class Clase234switch {
//12 11 7 4 9
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int mes=1;
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("el mes tiene 31 dias");
            
            break;
            case 2: System.out.println("el mes tiene 28 dias");
            
            break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("el mes tiene 30 dias");
            
            break;
            default: System.out.println("no existe");
            
        }
    }
    
}

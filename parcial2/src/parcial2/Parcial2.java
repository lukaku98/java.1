/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author alumno
 */
public class Parcial2 {

    private int edad;
    private String apellido;
    private String nombre;
    private static int idpersona=0;
    public double sueldo;

    public Parcial2(int edad, String apellido, String nombre,double sueldo) {
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
        this.idpersona = idpersona;
        this.sueldo=sueldo;
        idpersona ++;
    }

    public Parcial2() {
    
    
    
    }
    
    
    public static void main(String[] args) {
    Parcial2 parcial2A=new Parcial2( 30,"alvarez","pedro",1500);
    parcial2A.mostrar();
    parcial2A.setNombre("alfredo");
    
    
        
    }
    public void mostrar(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(idpersona);
        System.out.println(sueldo);
          
    
    
    
    
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}

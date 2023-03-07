/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author danii
 */
public class Persona {
    private int ID;
    private String nombre;
    private int edad;
    
    public Persona(){
       ID=0;
       nombre="";
       edad=0; 
      }
     public Persona(int id, String nom, int ed){
          ID=id;
          nombre=nom;
          edad=ed;
        
    }
     public int getID(){
         return ID;
         
     }
     public String getNombre(){
         return nombre;
     }
     public int getEdad(){
         return edad;
     }
     public void  setID(int valor ){
         ID=valor;
     }
     public void setNombre(String valor){
         nombre=valor;
     }
     public void setEdad(int valor){
         edad=valor;
     }
     public void ImprimirDatos(){
         
         System.out.println(" DE LA PERSONA");
         System.out.println("ID: "+ID);
         System.out.println("NOMBRE: "+ nombre);
         System.out.println("EDAD: "+edad);
     }
     
    
    
    
    
}

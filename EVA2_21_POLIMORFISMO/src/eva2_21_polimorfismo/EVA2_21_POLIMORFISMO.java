/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_polimorfismo;

/**
 *
 * @author danii
 */
public class EVA2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Estudiante estud=new Estudiante("DANIELA", "PINNON", 18, "22550343");
       
       estud.imprimirDatos();
       Docentes doce= new Docentes("Hugo", "Aceves", 36, "CHIHUAHUA");
       doce.imprimirDatos();
       //PUEDO TRATAR A LOS OBJETOS DE LAS SUBCLASES COMO OBJETOS DE LA SUPERCLASE
       // AL REVES NO SE PUEDE 
       Persona perso= estud;// A UNA VARIABLE DE TIPO PERSONA 
       //perso. ESTOY GENERALIZANDO(SIMPLIFICANDO)
       Persona perso2=doce;
       Persona perso3= new Persona();
      // Estudiante estud= perso3; 
      //DE LO PATRICULAR A LO GENERAL ES IMPOSIBLE CONVERTIR UNA PERSONA EN UN ESTUDIANTE
      //NO PODEMOS AGREGAR COSAS, SIMPLEMNETE OCULTAMOS 
       
       
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_interfaces;

/**
 *
 * @author danii
 */
public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       // MostrarDatos datos= MostrarDatos();
       Persona per= new Persona("Daniela", 18);
       per.imprimirDatos();
       Computadora compu= new Computadora("intel core i3", 8, 20000, "HP");
       compu.imprimirDatos();
       
      
        
    }
    
}

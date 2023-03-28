/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author danii
 */
public class EVA2_19_INTERFACES_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NO SE PUEDE INSTANCIAR
       // Figuras figura= new Figuras;
       // MostrarDatos mostar= new MostarDatos();
       Circulo circ= new Circulo(20);
       circ.imprimirDatos();
       Triangulo tria= new Triangulo(20, 20);
       tria.imprimirDatos();
       
        
    }
    
}

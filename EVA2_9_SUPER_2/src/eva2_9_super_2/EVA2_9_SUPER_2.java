/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author danii
 */
public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante=new Estudiante("DANIELA", "PINON", 18, "22550343");
        estudiante.imprimirDatos();
        System.out.println("DOCENTES");
        Docentes docentes= new Docentes("DANIII", "POLANCO", 18, "CULIACAN");
        docentes.imprimirDatos();
        System.out.println("PROVEEDORES");
        Proveedores proveedores= new Proveedores("POLETH", "ESCARCEGA", 18, "PHE202JSBJBF");
        proveedores.imprimirDatos();

        
        
    }
    
}

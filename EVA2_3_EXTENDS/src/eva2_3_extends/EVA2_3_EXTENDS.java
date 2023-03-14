/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author danii
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Estudiante estu = new Estudiante();
       estu.setNombre("Daniela");
       estu.setApelliodo("Pinon");
       estu.setEdad(18);
       estu.setNoControl("22550343");
       System.out.println("    IMPRIMIR DATOS");
       System.out.println("Nombre: "+ estu.getNombre());
       System.out.println("APELLIDO : "+ estu.getApelliodo());
       System.out.println("EDAD : "+ estu.getEdad());
       System.out.println("NOCONTROL: "+ estu.getNoControl());
       
       Proveedores prov =new Proveedores();
       System.out.println("");
       prov.setNombre("DANIELAA");
       prov.setApelliodo("POLANCO");
       prov.setEdad(18);
       prov.setRfc("PINON3004555");
       System.out.println("DATOS PROVEEDORES");
       System.out.println("NOMBRE:  "+prov.getNombre());
       System.out.println("APELLIDO: "+prov.getApelliodo());
       System.out.println("EDAD: "+prov.getEdad());
       System.out.println("RFC: "+prov.getRfc());
       
        
       
       
        
       
       
    }
    
}

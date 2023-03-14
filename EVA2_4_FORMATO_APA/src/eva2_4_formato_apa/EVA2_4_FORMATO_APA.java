/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author danii
 */
public class EVA2_4_FORMATO_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // SUPERCLASE COCUMENTO.
        //AUTOR
        
        Documento doc=new Documento("Daniela", "Practica", 03, 07, "chihuahua");
        System.out.println("IMPRIMIR DATOS:  ");
        System.out.println("DOCUMENTO");
        System.out.println("AUTOR: "+doc.getAutor());
        System.out.println("TITULO: "+doc.getTitulo());
        System.out.println("MES: "+doc.getMes());
        System.out.println("DIA: "+doc.getDia());
        System.out.println("CIUDAD: "+doc.getCiudad());
        Libro lib=new Libro("SEP");
        System.out.println("LIBRO:");
        System.out.println("AUTOR: "+lib.getAutor());
        System.out.println("TITULO: "+lib.getTitulo());
        System.out.println("MES: "+lib.getMes());
        System.out.println("DIA: "+lib.getDia());
        System.out.println("CIUDAD: "+lib.getCiudad());       
        System.out.println("EDITOTIAL:  "+lib.getEditorial());
        
        
        
        
        
    }
    
}

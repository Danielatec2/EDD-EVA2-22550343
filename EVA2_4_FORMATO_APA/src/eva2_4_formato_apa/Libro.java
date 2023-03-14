/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author danii
 */
public class Libro extends Documento {
    private String Editorial;

    public Libro(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    
    
}

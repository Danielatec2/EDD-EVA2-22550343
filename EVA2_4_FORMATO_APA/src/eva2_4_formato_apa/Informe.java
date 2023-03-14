/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author danii
 */
public class Informe  extends Documento{
    private String Editorial;

    private int annio;

    public Informe() {
    }

    public Informe(String Editorial,  int annio) {
        this.Editorial = Editorial;
 
        this.annio = annio;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }



    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author danii
 */
public class Articulo  extends Documento{
    private String tituloArt;

    public Articulo() {
    }

    
    public Articulo(String tituloArt) {
        this.tituloArt = tituloArt;
    }

    public String getTituloArt() {
        return tituloArt;
    }

    public void setTituloArt(String tituloArt) {
        this.tituloArt = tituloArt;
    }
    
    
}

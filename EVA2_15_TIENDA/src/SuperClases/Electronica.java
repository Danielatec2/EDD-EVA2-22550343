/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClases;

/**
 *
 * @author danii
 */
public abstract class Electronica extends Producto {
    private String fabricante;
    private String modelo;
    private int  garantía; //(dias de garantía)

    public Electronica() {
        super();
       this.fabricante="";
       this.modelo="";
       this.garantía=0;
       
    }
    

    public Electronica(String fabricante, String modelo, int garantía, double precio, String nombre, String unidad) {
        super(precio, nombre, unidad);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantía = garantía;
    }
    



    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantía() {
        return garantía;
    }

    public void setGarantía(int garantía) {
        this.garantía = garantía;
    }
    
    
    
}

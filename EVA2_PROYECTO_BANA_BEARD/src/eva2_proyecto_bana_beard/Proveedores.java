/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_proyecto_bana_beard;


/**
 *
 * @author danii
 */
public class Proveedores   {
    protected double cantidad;  //50
    protected double precio;
    protected String nomproducto; //PLATONOS //jugos

    public Proveedores() {
        this.cantidad = 0;
        this.precio = 0;
        this.nomproducto = "";
    }

    public Proveedores( double cantidad, double precio, String nomproducto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nomproducto = nomproducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNomproducto() {
        return nomproducto;
    }

    public void setNomproducto(String nomproducto) {
        this.nomproducto = nomproducto;
    }


  

}

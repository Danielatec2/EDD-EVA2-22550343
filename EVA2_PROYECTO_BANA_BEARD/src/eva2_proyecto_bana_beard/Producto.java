/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_proyecto_bana_beard;

import java.util.Scanner;

/**
 *
 * @author danii
 */
public class Producto extends Proveedores implements Resultados  {
    private int fechaCaducidad; // ingresa dia,mes, año ejemplo 051404 
    private long numCodigobarras;//para alimentos alacenados en plastico //
    private boolean  tipoDeAlimento;
    
    public Producto() {
        this.fechaCaducidad=0;
        this.numCodigobarras=0;
        this.tipoDeAlimento=false;
    }

    public Producto(int fechaCaducidad, long numCodigobarras, boolean tipoDeAlimento) {
        this.fechaCaducidad = fechaCaducidad;
        this.numCodigobarras = numCodigobarras;
        this.tipoDeAlimento = tipoDeAlimento;
    }

    public Producto(int fechaCaducidad, long numCodigobarras, boolean tipoDeAlimento, double cantidad, double precio, String nomproducto) {
        super(cantidad, precio, nomproducto);
        this.fechaCaducidad = fechaCaducidad;
        this.numCodigobarras = numCodigobarras;
        this.tipoDeAlimento = tipoDeAlimento;
    }




    public int getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public long getNumCodigobarras() {
        return numCodigobarras;
    }

    public void setNumCodigobarras(long numCodigobarras) {
        this.numCodigobarras = numCodigobarras;
    }

    public boolean isTipoDeAlimento() {
        return tipoDeAlimento;
    }

    public void setTipoDeAlimento(boolean tipoDeAlimento) {
        this.tipoDeAlimento = tipoDeAlimento;
    }
    
    
    public void totalProductos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos: ");
       cantidad = input.nextDouble();
        for (int i = 1; i <=cantidad; i++) {
            System.out.println("Nombre del producto: ");
            nomproducto=input.next();
            System.out.println("Precio del producto: ");
            precio=input.nextDouble();
            System.out.println("Ingresa el tipo de desecho Organico is a false, Inorganico is a true ");
        tipoDeAlimento = input.nextBoolean();// nos permite capturar

        if (tipoDeAlimento==false) {                                                 
            System.out.println("El desecho  es Organico");
            
          

        } else {
            System.out.println("El desecho es Inorganico");

        }
            
        }
    }
    
 

    @Override
    public void imprimirResultados() {
         totalProductos();
         
    }


    
    
}

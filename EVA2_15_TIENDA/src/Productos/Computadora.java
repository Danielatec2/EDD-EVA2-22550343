/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Electronica;

/**
 *
 * @author danii
 */
public final class Computadora extends  Electronica {
       private double tamannio;
        private  int memoria;
        private String procesador;
        private String dd;

    public Computadora() {
        super();
        this.tamannio =0;
        this.memoria = 0;
        this.procesador ="";
        this.dd = "";
    }
        

    public Computadora(double tamannio, int memoria, String procesador, String dd, String fabricante, String modelo, int garantía, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantía, precio, nombre, unidad);
        this.tamannio = tamannio;
        this.memoria = memoria;
        this.procesador = procesador;
        this.dd = dd;
    }

    public double getTamannio() {
        return tamannio;
    }

    public void setTamannio(double tamannio) {
        this.tamannio = tamannio;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    @Override
    public double precioVenta(int cant) {
      //10 UNIDADES----> El precio es del 80%
      if (cant <10)
          return precio*cant;
      else 
          return (precio*0.8)*cant;
      
      
    }
    
}
//Computadora es una clase final, y ya no se puede heredar de una clase final

//class laptop extends Computadora{   
//}

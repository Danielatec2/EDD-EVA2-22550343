/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author danii
 */
public class Vehiculo implements ControlVelocidad {

    private String marca;
    private  int velocidad;

    public Vehiculo() {
   
        this.marca ="";
        this.velocidad=0;
    }

    public Vehiculo( String marca) {
      
        this.marca = marca;
        this.velocidad=velocidad;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    

    @Override
    public void acelerar() {
    }

    @Override
    public void detener() {
    }

    @Override
    public void imprimirVel() {
    }
    
    
}

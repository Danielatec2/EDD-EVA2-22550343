/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author danii
 */
public class Automovil extends Vehiculo  implements ControlVelocidad{
    private String modelo;
    private int annio;
    

    public Automovil() {
    }

    public Automovil(String modelo, int annio) {
        this.modelo = modelo;
        this.annio = annio;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

   public void setAnnio(int annio){
       this.annio=annio;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author danii
 */
public class Bicicleta extends Vehiculo implements ControlVelocidad {
    private String color;
    private String tipo;

    public Bicicleta(String color, String tipo) {
        this.color = color;
        this.tipo = tipo;
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

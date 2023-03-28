/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_22_polimorfismo_figuras;

/**
 *
 * @author danii
 */
public class Circulo implements Figuras, MostrarDatos {
    private double radio;

    public Circulo() {
        this.radio=5;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

 

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPeri() {
        return Math.PI*(radio*2);
    }



    @Override
    public void imprimirDatos() {
        System.out.println("CIRCULO");
        System.out.println(" RADIO: "+ radio);
        System.out.println("AREA "+calcularArea());
        System.out.println("PERÍMETRO"+ calcularPeri());
    }
    
    
    
}

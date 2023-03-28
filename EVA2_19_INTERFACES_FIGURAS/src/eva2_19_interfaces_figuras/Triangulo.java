/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author danii
 */
public class Triangulo implements Figuras ,MostrarDatos{
    private double base;
    private double altura;

    public Triangulo() {
        this.base=0;
        this.altura=0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPeri() {
        double hip =Math.hypot(base, altura);
        return (base+altura+hip);
    }

    @Override
    public void imprimirDatos() {
   System.out.println("TRIANGULO");
        System.out.println(" BASE: "+ base);
        System.out.println("ALTURA: "+altura);
        System.out.println("ÁREA: "+ calcularArea());
        System.out.println("PERÍMETRO : "+calcularPeri());
    }
    
    
    
}
